package org.com.apidemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.*;

import java.time.LocalDateTime;

@Entity
public class Users {

    @Id
    private int id;
    private String username;

    private LocalDateTime userTimestamp;

    @PrePersist
    protected void onCreate() {
        this.userTimestamp = LocalDateTime.now(); // Auto-assign timestamp
    }


    public LocalDateTime getUserTimestamp() {
        return userTimestamp;
    }

    public void setUserTimestamp(LocalDateTime userTimestamp) {
        this.userTimestamp = userTimestamp;
    }

    public Users() {
    }

    public Users(int id, String username,LocalDateTime userTimestamp) {
        this.id = id;
        this.username = username;
        this.userTimestamp = userTimestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
