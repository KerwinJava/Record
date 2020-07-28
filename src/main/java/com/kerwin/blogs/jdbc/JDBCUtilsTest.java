package com.kerwin.blogs.jdbc;

import com.kerwin.blogs.BlogsApplicationTest;
import org.junit.Test;

public class JDBCUtilsTest extends BlogsApplicationTest {

    @Test
    public void getConnection() {
        JDBCUtils.getInstance().getConnection();
    }
}