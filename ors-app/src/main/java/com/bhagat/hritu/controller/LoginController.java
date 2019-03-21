package com.bhagat.hritu.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bhagat.hritu.dto.UserDTO;
import com.bhagat.hritu.exception.ApplicationException;
import com.bhagat.hritu.service.UserService;
import com.bhagat.hritu.session.OrsSession;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;
    
    @Autowired
    private OrsSession orsSession;
    
    private static Logger LOG= LoggerFactory.getLogger(LoginController.class);
    @RequestMapping("/")
    public String displayLogin() {
        LOG.info("diplay login method start");
        return "login";
    }

    @RequestMapping(
            value = "/login.do", method = RequestMethod.POST)
    public String authenticate(@ModelAttribute UserDTO user, Model model, HttpServletRequest httpServletRequest) {
        LOG.info("authenticate method start");
        try{
            UserDTO userDto = userService.authenticate(user);
            orsSession.setUser(userDto);
            
        }catch(ApplicationException e){
            LOG.error("Critical Issue::",e);
            model.addAttribute("errorMessage", e.getMessage());
            return "login";
        }
        LOG.info("authenticate method ends");
        return "welcome";
        
    }
}
