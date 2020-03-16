package org.example.basic.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String getHome() {
        return "<h1>Welcome</h1>";
    }

    @GetMapping("/user")
    public String getUser() {
        return "<h1>User</h1>";
    }

    @GetMapping("/admin")
    public String getAdmin() {
        return "<h1>Admin</h1>";
    }

}
