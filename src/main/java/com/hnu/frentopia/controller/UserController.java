package com.hnu.frentopia.controller;

import com.hnu.frentopia.service.UserService;
import com.hnu.frentopia.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 회원가입 폼
     * @return
     */

    @GetMapping("/signUp")
    public String signUpForm() {
        return "signUp";
    }

    /**
     * 회원가입 진행
     * @param user
     * @return
     */

    @PostMapping("/signUp")
    public String signUp(User user) {
        userService.createUser(user);
        return "redirect:/";
    }
}