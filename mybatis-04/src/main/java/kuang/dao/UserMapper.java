package kuang.dao;

import kuang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

//    根据id查询用户
    User getUserById(int id);

//    分页功能实现
    List<User> getUserByLimit(Map<String,Integer> map);

}
