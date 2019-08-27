package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;
import com.tedu.sp01.pojo.User;

public interface OrederService {
    Order getOrder(String orderId);
    void addOrder(Order order);

}
