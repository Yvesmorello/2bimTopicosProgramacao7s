package com.example.atividadeTaskJWT.auth;

public class AuthDTO {

    public record AuthRequest(String username, String password, String role) {}

    public record RegisterRequest(
            String username,
            String password,
            String role
    ) {}
}
