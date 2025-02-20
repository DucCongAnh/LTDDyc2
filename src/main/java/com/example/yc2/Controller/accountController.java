package com.example.yc2.Controller;

import com.example.yc2.Service.accountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class accountController {

    @Autowired
    private accountService accountService;

    @PostMapping("/login")
    public boolean login(@RequestParam String email, @RequestParam String password) {
        boolean isAuthenticated = accountService.login(email, password);

        if (isAuthenticated) {
            return true;
        } else {
            return false;
        }
    }
}
