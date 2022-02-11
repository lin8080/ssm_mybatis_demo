package com.huajia.controller;

import com.huajia.entity.UserTab;
import com.huajia.service.IUserTabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/userTab")
public class UserTabController {
    @Autowired
    private IUserTabService userTabService;

    @GetMapping("/getUserList")
    @ResponseBody
    public List<UserTab> getUserList(){
        return userTabService.getUserList();
    }
}
