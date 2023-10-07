package com.virtus.orderservice.service;

import com.virtus.feign.clients.UserClient;
import com.virtus.feign.pojo.User;
import com.virtus.orderservice.mapper.OrderMapper;
import com.virtus.orderservice.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;
//    @Autowired
//    private RestTemplate restTemplate;
//    public Order findOrderById(Long orderId){
//
//        Order order = orderMapper.findOrderById(orderId);
//        String url = "http://userservice/user/"+order.getUser_id() ;
//        User user = restTemplate.getForObject(url, User.class);
//        order.setUser(user);
//        return order;
//    }
    @Autowired
    private UserClient userClient;
    public Order findOrderById(Long orderId){

        Order order = orderMapper.findOrderById(orderId);
        User user = userClient.findById(order.getUser_id());
        order.setUser(user);
        return order;
    }
}
