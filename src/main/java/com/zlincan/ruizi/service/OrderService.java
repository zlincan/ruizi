package com.zlincan.ruizi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zlincan.ruizi.entity.Orders;

public interface OrderService extends IService<Orders> {

    /**
     * 用户下单
     * @param orders
     */
    public void submit(Orders orders);
}
