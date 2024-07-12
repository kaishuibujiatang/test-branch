package dao;

import kuang.dao.UserMapper;
import kuang.pojo.User;
import kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserDaoTest {

    static Logger logger = Logger.getLogger(UserDaoTest.class);

    @Test
    public void getUserByLimit(){
        SqlSession sqlSession = MybatisUtils.getSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("startIndex",1);
        map.put("pageSize",2);

        List<User> userList = mapper.getUserByLimit(map);

        for (User user : userList) {
            System.out.println(user);
        }


        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSession();

        logger.info("进入getUserById方法");

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(3);

        System.out.println(user);


        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testLog(){
        logger.info("info:进入testlog4j");
        logger.debug("debug:进入testlog4j");
        logger.error("error：进入testlog4j");
    }
}
