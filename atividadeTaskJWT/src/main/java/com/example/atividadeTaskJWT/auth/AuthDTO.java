package com.example.atividadeTaskJWT.auth;

public class AuthDTO {
    public record AuthRequest(String username, String password) {}
    public record AuthResponse(String token) {}
}
