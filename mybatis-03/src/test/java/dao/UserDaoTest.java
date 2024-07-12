package dao;

import kuang.dao.UserMapper;
import kuang.pojo.User;
import kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserDaoTest {

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(2);

        System.out.println(user);


        sqlSession.commit();
        sqlSession.close();
    }
}
