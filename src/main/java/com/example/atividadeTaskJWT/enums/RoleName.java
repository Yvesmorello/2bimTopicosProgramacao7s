package com.example.atividadeTaskJWT.enums;

public enum RoleName {

    ADMIN ("admin"),
    USER("user");

    private String role;

    RoleName(String role) {
        this.role = role;
    }
    public String getStatus() {
        return role;
    }
    public void setStatus(String role) {
        this.role = role;
    }
}
