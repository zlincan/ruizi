package com.zlincan.ruizi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zlincan.ruizi.entity.User;
import com.zlincan.ruizi.mapper.UserMapper;
import com.zlincan.ruizi.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
