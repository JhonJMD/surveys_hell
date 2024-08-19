package com.surveys_hell.users.domain.entity;

public class Users {
    private int id;
    private boolean enabled;
    private String username;
    private String password;

    public Users() {}
    public Users(int id, boolean enabled, String username, String password) {
        this.id = id;
        this.enabled = enabled;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public boolean isEnabled() {
        return enabled;
    }
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
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
    public void setPassword(String password) {
        this.password = password;
    }
}