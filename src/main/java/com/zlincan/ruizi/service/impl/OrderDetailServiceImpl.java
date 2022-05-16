package com.zlincan.ruizi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zlincan.ruizi.entity.OrderDetail;
import com.zlincan.ruizi.mapper.OrderDetailMapper;
import com.zlincan.ruizi.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}