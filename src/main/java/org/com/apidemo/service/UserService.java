package org.com.apidemo.service;


import org.com.apidemo.model.Users;
import org.com.apidemo.repo.UserRepo;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class UserService {


    private UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


    public void addUser(Users user) {
        userRepo.save(user);
    }

    public List<Users> getUsers() {
        return userRepo.findAll();
    }

    public Users getIsUserById(int id) {
        Boolean isThere =  userRepo.findById(id).isPresent();
        if(isThere) {
            Users user1 = userRepo.findById(id).get();
            return user1;
        }
        return null;
    }
}
