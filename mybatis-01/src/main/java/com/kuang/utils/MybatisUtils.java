package com.kuang.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//sqlSessionFactory->sqlSession
public class MybatisUtils {

    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
//            获取sqlSessionFactory
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//        有了sqlSessionFactory，顾名思义，我们就可以获取使用sqlSession的实例了
//        sqlSession实例完全包含面向数据库执行的sql命令所需的所有方法。
    public static SqlSession getSession(){
       return sqlSessionFactory.openSession();
        }

}
