package com.virtus.orderservice.mapper;

import com.virtus.orderservice.pojo.Order;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {

    @Select("""
            select id,user_Id,name,price,num 
            from tb_order where id = #{orderId}
            """)
    Order findOrderById(@Param("orderId") Long id);
}

