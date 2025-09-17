package com.automation.pam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
//import org.springframework.data.annotation.Id;
import jakarta.persistence.Id;




@Entity
@Table(name = "user_details", schema = "ffid_req_automation")
//@Table(name = "user_details")
public class UserDetails {

    @Id
    @Column(name = "user_id")
    private String userId;

    @Column(name = "passwords")
    private String password;

    // Default constructor required by JPA
    public UserDetails() {
    }

    public UserDetails(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
