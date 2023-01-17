package com.sso.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Table
@Entity
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String role;
    @ManyToOne
    @JsonIgnore
    private Users user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
