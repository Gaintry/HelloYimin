package com.example.gaintry.controller;

import com.example.gaintry.entity.User;
import com.example.gaintry.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/{id}")
    public String GetUser(@PathVariable int id) {
        return userService.getUserById(id).toString();
    }


    @RequestMapping("/")
    public ModelAndView index()
    {
        ModelAndView mav = new ModelAndView("index");
        List list = userService.getAll();
        mav.addObject("list",list);
        return  mav;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(User user) {
      userService.insertUser(user);
      return  "1";
    }

}
