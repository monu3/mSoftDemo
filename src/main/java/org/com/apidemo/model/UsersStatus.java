package org.com.apidemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UsersStatus {

    @Id
    private String userId;
    private Boolean isStatus;


}
