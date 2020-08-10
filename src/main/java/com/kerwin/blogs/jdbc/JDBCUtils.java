package com.kerwin.blogs.jdbc;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Slf4j
public class JDBCUtils {

    private static JDBCUtils instance = null;

    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {

        }
    }
    private  JDBCUtils(){

    }

    public static JDBCUtils getInstance(){
        if(instance == null){
            instance =new JDBCUtils();
        }
        return instance;
    }

    public  Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306?characterEncoding=UTF-8&serverTimezone=PRC","root", "123456");
        } catch (SQLException throwables) {
            log.error(" connect error,{}",throwables);
        }
        return connection;
    }
}
