//package com.drips.mybatis;
//
//import com.drips.mybatis.entity.User;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//
//import java.io.IOException;
//import java.util.List;
//
///**
// * @author lijb
// */
//public class SimpleMybatisApp {
//    public static void main(String[] args){
//
//
//        try {
//            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(SimpleMybatisApp.class.getClassLoader(),"Configuration.xml"),"development");
//            SqlSession sqlSession=sqlSessionFactory.openSession();
//            try {
//                User user = sqlSession.selectOne("com.drips.mybatis.mapper.UserMapper.getUser", 2L);
//                List<User> userList=sqlSession.selectList("com.drips.mybatis.dao.UserDao.findAll");
//                System.out.println("id="+user.getId()+",username="+user.getUsername()+",password="+user.getPassword()+",gender="+user.getGender().getDesc()+",userList size="+userList.size());
//            }finally {
//                sqlSession.close();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//}
