package com.example.atividadeTaskJWT.auth;

import com.example.atividadeTaskJWT.enums.RoleName;

public class AuthDTO {

    public record AuthRequest(String username, String password, RoleName role) {}

    public record RegisterRequest(
            String username,
            String password,
            RoleName role
    ) {}
}
