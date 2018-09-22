package com.naik.soft.snaik.model;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class User {

    public String username;
    public String email;
    public String phone;
    public int id;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String email, String phone, int id) {
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.id = id;
    }

}