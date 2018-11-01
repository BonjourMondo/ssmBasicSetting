package com.leesanghyuk.tst;

import com.leesanghyuk.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisTest {
    public static void main(String[] args) throws IOException {
        //读取mybatis-config.xml文件
        InputStream inputStream= Resources.getResourceAsStream("mybatis-config.xml");
        //初始化mybatis，创建sqlSessionFactory类的实例
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        //创建Session实例
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //创建User对象
        User user=new User("admin","男",26);
        //插入数据
        sqlSession.insert("com.leesanghyuk.mapper.UserMapper.save",user);
        //提交事务
        sqlSession.commit();
        //关闭session
        sqlSession.close();
    }
}
