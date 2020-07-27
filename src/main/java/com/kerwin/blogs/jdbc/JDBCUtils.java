package com.kerwin.blogs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Slf4j
public class JDBCUtils {

    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {

        }
    }

    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306?characterEncoding=UTF-8","root", "123456");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }
}
