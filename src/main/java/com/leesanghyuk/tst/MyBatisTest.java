package com.leesanghyuk.tst;

import com.leesanghyuk.model.User;
import org.apache.ibatis.session.SqlSession;
import java.io.IOException;

public class MyBatisTest {
    public static void main(String[] args) throws IOException {
        SqlSession sqlSession=FKSqlSessionFactory.getSqlSession();
        User user=sqlSession.selectOne("com.leesanghyuk.mapper.UserMapper.selectUser",1);
        user.setName("LeesangHyuk");
        sqlSession.update("com.leesanghyuk.mapper.UserMapper.modifyUser",user);
        sqlSession.commit();
        sqlSession.close();
    }
}
