package org.example.ldap.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String getHome() {
        return "<h1>Welcome</h1>" +
                getLink("user") +
                getLink("admin");
    }

    @GetMapping("/user")
    public String getUser() {
        return "<h1>User</h1>" + getLink("logout");
    }

    @GetMapping("/admin")
    public String getAdmin() {
        return "<h1>Admin</h1>"  +
                getLink("user") +
                getLink("logout");
    }

    private String getLink(String link) {
        return String.format("<h2><a href='/%s'>%s</a></h2>", link, link.toUpperCase());
    }

}
