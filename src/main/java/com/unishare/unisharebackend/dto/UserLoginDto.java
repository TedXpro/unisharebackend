package com.unishare.unisharebackend.dto;

public class UserLoginDto {
    private String username;
    private String password;

    public UserLoginDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String id) {
        this.password = id;
    }

    @Override
    public String toString() {
        return "UserLoginDto [username=" + username + ", id=" + password + "]";
    }
}
