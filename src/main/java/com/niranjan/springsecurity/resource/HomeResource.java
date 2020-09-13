package com.niranjan.springsecurity.resource;

import com.niranjan.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String home() {
        return ("<h1>Well come</h1>");
    }

    @GetMapping("/user")
    public String user() {
        return ("<h1>Well come User</h1>");
    }

    @GetMapping("/admin")
    public String admin() {
        return ("<h1>Well come Admin</h1>");
    }
}
