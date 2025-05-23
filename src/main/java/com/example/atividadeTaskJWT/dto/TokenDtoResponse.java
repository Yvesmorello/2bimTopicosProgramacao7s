package com.example.atividadeTaskJWT.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"message", "token"})
public class TokenDtoResponse {

    private String message;
    private String token;

    public TokenDtoResponse(String token) {
        this.message = "Token para acesso";
        this.token = token;
    }

    public String getMessage() {
        return message;
    }

    public String getToken() {
        return token;
    }

}
