package com.huajia.service.impl;

import com.huajia.dao.UserTabMapper;
import com.huajia.entity.UserTab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.huajia.service.IUserTabService;

import java.util.List;

@Service
public class UserTabServiceImpl implements IUserTabService {

    @Autowired
    private UserTabMapper userTabMapper;

    public List<UserTab> getUserList() {
        return userTabMapper.getUserList();
    }
}
