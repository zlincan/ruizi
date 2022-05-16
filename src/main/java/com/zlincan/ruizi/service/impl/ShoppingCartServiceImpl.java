package com.zlincan.ruizi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zlincan.ruizi.entity.ShoppingCart;
import com.zlincan.ruizi.mapper.ShoppingCartMapper;
import com.zlincan.ruizi.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

}
