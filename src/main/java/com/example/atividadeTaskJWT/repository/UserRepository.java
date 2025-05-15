package com.example.atividadeTaskJWT.repository;

import com.example.atividadeTaskJWT.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
