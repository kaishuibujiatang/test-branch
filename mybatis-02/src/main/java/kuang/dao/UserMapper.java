package kuang.dao;

import kuang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

//    查询全部用户
    List<User> getUserList();

//    根据id查询用户
    User getUserById(int id);

//    insert一个用户
    int AddUser(User user);

//    修改用户
    int updateUser(User user);

//    删除一个用户
    int deleteUser(int id);

}
