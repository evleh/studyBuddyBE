package org.example.backend.model;

import java.time.LocalDateTime;

public class RegisteredUser {
    private String UUID;
    private String username;
    private String foto;
    private String salutation;  // Anrede
    private String firstname;
    private String lastname;
    private String password;
    private String country;
    private LocalDateTime lastLogin;

    public RegisteredUser() {
        this.UUID = UUID;
    }

    public RegisteredUser(String UUID, String username, String foto, String salutation, String firstname, String lastname, String password, String country, LocalDateTime lastLogin) {
        this.UUID = UUID;
        this.username = username;
        this.foto = foto;
        this.salutation = salutation;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.country = country;
        this.lastLogin = lastLogin;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }
}
