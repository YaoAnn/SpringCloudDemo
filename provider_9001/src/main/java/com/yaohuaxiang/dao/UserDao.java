package com.yaohuaxiang.dao;

import com.yaohuaxiang.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yaohuaxiang
 * @create 2020/11/2 - 14:10
 */

@Repository
@Mapper
public interface UserDao {
    @Insert("insert into user(username,password,address) values(#{username},#{password},#{address})")
    void addUser(User user);

    @Delete("delete from user where uid = #{uid}")
    void deleteUserById(Integer uid);

    @Update("update from user set username=#{username},password=#{password},address=#{address} where uid=#{uid}")
    void updateUserById(User user);

    @Select("select * from user where uid=#{uid}")
    User getUserById(Integer uid);

    @Select("select * from user")
    List<User> getUsers();
}
