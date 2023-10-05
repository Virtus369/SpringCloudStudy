package com.virtus.userservice.mapper;

import com.virtus.userservice.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

 @Select("""
         select id,username,address from tb_user where id = #{id}
         """)
 User findUserById(@Param("id") long id);

}
