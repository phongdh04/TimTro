package com.timtro.modules.users.model;

import com.timtro.core.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column(unique = true, length = 50)
    private String username;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    @Column(name = "full_name", nullable = false, length = 100)
    private String fullName;

    @Column(nullable = false, unique = true, length = 20)
    private String phone;

    @Column(unique = true, length = 100)
    private String email;

    @Column(name = "avatar_url")
    private String avatarUrl;

    @Column(length = 20)
    @Enumerated(EnumType.STRING)
    private Role role = Role.STUDENT;

    @Column(name = "is_active")
    private Boolean isActive = true;

    public enum Role {
        STUDENT, LANDLORD, ADMIN, STAFF
    }
}
