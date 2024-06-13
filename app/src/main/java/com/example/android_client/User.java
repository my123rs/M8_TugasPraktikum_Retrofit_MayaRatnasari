package com.example.android_client;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("email")
    private String email;
    @SerializedName("status")
    private String status;
    @SerializedName("hobi")
    private String hobi;
    // Konstruktor untuk membuat objek User baru
    public User(int id, String name, String email, String status, String hobi) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.status = status;
        this.hobi = hobi;
    }
    // Konstruktor untuk membuat objek User tanpa id (misalnya, untuk menambahkan user baru)
    public User(String name, String email, String status, String hobi) {
        this.name = name;
        this.email = email;
        this.status = status;
        this.hobi = hobi;
    }
    // Getter untuk mendapatkan id user
    public int getId() {
        return id;
    }
    // Setter untuk mengatur id user
    public void setId(int id) {
        this.id = id;
    }
    // Getter untuk mendapatkan nama user
    public String getName() {
        return name;
    }
    // Setter untuk mengatur nama user
    public void setName(String name) {
        this.name = name;
    }
    // Getter untuk mendapatkan email user
    public String getEmail() {
        return email;
    }
    // Setter untuk mengatur email user
    public void setEmail(String email) {
        this.email = email;
    }
    public String getStatus() {
        return status;
    }
    // Setter untuk mengatur email user
    public void setStatus(String status) {
        this.status = status;
    }
    public String getHobi() {
        return hobi;
    }
    // Setter untuk mengatur email user
    public void setHobi(String hobi) {
        this.hobi = hobi;
    }
}