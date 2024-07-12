package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
//    模糊查询
    List<User> getUserLike(String s);


//    查询全部用户
    List<User> getUserList();
//    根据id查询用户
    User getUserById(int id);

//    insert一个用户
    int AddUser(User user);

    int addUser2(Map<String,Object> map);

//    修改用户
    int updateUser(User user);

//    删除一个用户
    int deleteUser(int id);

}
