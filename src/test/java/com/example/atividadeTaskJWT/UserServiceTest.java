package com.example.atividadeTaskJWT;

import com.example.atividadeTaskJWT.auth.AuthDTO;
import com.example.atividadeTaskJWT.enums.RoleName;
import com.example.atividadeTaskJWT.model.User;
import com.example.atividadeTaskJWT.repository.UserRepository;
import com.example.atividadeTaskJWT.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void testRegisterUser() {
        AuthDTO.RegisterRequest request = new AuthDTO.RegisterRequest("testuser", "123456", RoleName.USER);
        User user = userService.register(request);

        assertNotNull(user.getId());
        assertEquals("testuser", user.getUsername());
        assertTrue(passwordEncoder.matches("123456", user.getPassword()));
        assertEquals(RoleName.USER, user.getRole());
    }

    @Test
    public void testLoadUserByUsername() {
        User newUser = new User();
        newUser.setUsername("loaduser");
        newUser.setPassword(passwordEncoder.encode("senha"));
        newUser.setRole(RoleName.ADMIN);
        repository.save(newUser);

        User user = (User) userService.loadUserByUsername("loaduser");

        assertEquals("loaduser", user.getUsername());
        assertTrue(user.getAuthorities().stream()
                .anyMatch(auth -> auth.getAuthority().equals("ADMIN")));
    }
}
