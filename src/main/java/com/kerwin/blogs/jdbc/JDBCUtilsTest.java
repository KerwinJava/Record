package com.kerwin.blogs.jdbc;

import com.kerwin.blogs.BlogsApplicationTest;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;

public class JDBCUtilsTest extends BlogsApplicationTest {

    @Test
    public void getConnection() {
       Connection connection =  JDBCUtils.getInstance().getConnection();
        Assert.assertNotNull(connection);
    }
}