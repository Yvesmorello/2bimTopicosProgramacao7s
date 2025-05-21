package com.example.atividadeTaskJWT.model;

import com.example.atividadeTaskJWT.enums.RoleName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="roles")
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@Getter
public class UserRoles {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Enumerated(EnumType.STRING)
        private RoleName name;

        public Long getId() {
                return id;
        }

        public RoleName getName() {
                return name;
        }
}
