package org.com.apidemo.Controller;


import org.com.apidemo.model.Users;
import org.com.apidemo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {


    private UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }


    //to check the projects
    @GetMapping("/")
    public String home(){
        return "Hello World";
    }

    //to get the users by the database
    @GetMapping("/Users")
    public List<Users> getUsers(){
        return userService.getUsers();
    }


    //to save the user in the database
    @PostMapping("/Users")
    public void addUser(@RequestBody Users user){
        userService.addUser(user);
    }


    //to check the user is available in db or not ,if yes return the time stamp for that user
    @GetMapping("/isUsers/{id}")
    public Users getIsUser(@PathVariable int id){
        return userService.getIsUserById(id);
    }



}
