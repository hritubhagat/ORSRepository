package com.bhagat.hritu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bhagat.hritu.dto.UserDTO;
import com.bhagat.hritu.exception.DuplicateUserException;
import com.bhagat.hritu.service.UserService;

@Controller
public class RegistrationController {

    @Autowired
    private UserService userService;
    
    
    @RequestMapping("/showRegistration")
    public String displayRegistration() {
        return "registration";
    }
    
    @RequestMapping(
            value = "/registration.do", method = RequestMethod.POST)
    public String registerUser(@ModelAttribute UserDTO user, Model model) {
        boolean isUserCreated=false;
        try{
            isUserCreated = userService.registerUser(user);
        }catch(DuplicateUserException e){
            model.addAttribute("errorMessage", "User already exists!!");
        }
        if(isUserCreated){
            model.addAttribute("userCreated", "Account created successfully, please login!!");
            return "login";
        }
        return "registration";
    }
    
}
