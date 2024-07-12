package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {

    @Test
    public void getUserLike(){
        SqlSession sqlSession = MybatisUtils.getSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserLike("李");

        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test(){
//        第一步获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSession();

//        方式一：getMapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();

        for (User user : userList){
            System.out.println(user);
        }

//        关闭SqlSession
        sqlSession.close();

    }

    @Test
    public void getUserById(){
//        1.第一步获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSession();

//        2.getMapper方法
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(1);
        System.out.println(user);

        //        关闭SqlSession
        sqlSession.close();

    }

    @Test
    public void AddUser(){
       // 1.第一步获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSession();

        //2.getMapper方法
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.AddUser(new User(6, "厉害", "123456"));

        if (res>0){
            System.out.println("插入成功");
        }
//        提交事务、增删改生效需要提交事务
        sqlSession.commit();
        //        关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void addUser2(){
        // 1.第一步获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSession();

        //2.getMapper方法
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId",7);
        map.put("userName", "大海");
        map.put("password", "2333");

        mapper.addUser2(map);
        sqlSession.commit();
        //        关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void updateUser(){
        //1.第一步获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSession();
        //2.getMapper方法
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.updateUser(new User(3, "a12h","963852"));

        System.out.println(res);
        if (res>0){
            System.out.println("修改成功");
        }
//        提交事务
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.deleteUser(1);

        if(res>0){
            System.out.println("删除成功");
        }

        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void testGithub(){
//        测试第二次提交
    }

}
