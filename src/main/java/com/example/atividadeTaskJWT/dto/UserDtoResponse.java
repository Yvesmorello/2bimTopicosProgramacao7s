package com.example.atividadeTaskJWT.dto;

import com.example.atividadeTaskJWT.enums.RoleName;

public class UserDtoResponse {

        private String username;
        private String password;
        private RoleName role;

        public UserDtoResponse(String username, String password, RoleName role) {
            this.username = username;
            this.password = password;
            this.role = role;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public RoleName getRole() {
            return role;
        }
    }

