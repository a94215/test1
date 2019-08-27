package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;
import com.tedu.sp01.pojo.User;

public interface UserService {
    User getUser(Integer id);
    void addScore(Integer id,Integer score);//score根据订单来获取积分
}
