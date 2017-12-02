package com.itszt.controller;



import com.itszt.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ma on 2017/11/30.
 */


@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/reg")
    public String reg(String username, String uspwd) {
        userService.regUser(username,uspwd);
        System.out.println("UserController777.....");
        return "user/usercenter";
    }
}
