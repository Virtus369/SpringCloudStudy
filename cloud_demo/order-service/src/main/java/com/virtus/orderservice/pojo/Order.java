package com.virtus.orderservice.pojo;

import lombok.Data;

@Data
public class Order {

    private Long id;
    private Long user_id;
    private String name;
    private String price;
    private Integer num;
    private User user;

}