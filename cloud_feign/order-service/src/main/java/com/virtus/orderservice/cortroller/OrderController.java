package com.virtus.orderservice.cortroller;

import com.virtus.orderservice.pojo.Order;
import com.virtus.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/{orderId}")
    public Order findOrderById(@PathVariable("orderId") Long orderId){
        return orderService.findOrderById(orderId);
    }
}
