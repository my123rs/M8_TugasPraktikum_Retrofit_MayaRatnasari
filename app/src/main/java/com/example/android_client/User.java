package com.example.android_client;

public class User {
    private int id;
    private String name;
    private String email;
    private String status;
    private String hobi;
    public User(String name, String email, String status, String hobi) {
        this.name = name;
        this.email = email;
        this.status = status;
        this.hobi = hobi; }
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getStatus() { return status; }
    public String getHobi() { return hobi; }
}
