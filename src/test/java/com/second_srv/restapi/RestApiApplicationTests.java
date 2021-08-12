package com.second_srv.restapi;

import com.second_srv.restapi.base.DataBaseHandler;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.ResultSet;
import java.sql.SQLException;

@SpringBootTest
class RestApiApplicationTests {

    @Test
    void contextLoads() throws SQLException, ClassNotFoundException {
        DataBaseHandler dataBaseHandler = new DataBaseHandler();
        ResultSet rs =  dataBaseHandler.getReq("AAPL");
        System.out.println("Revenue: " + rs.getLong(2));
        System.out.println("Shares: " + rs.getLong(3));
        System.out.println("Total Assets: " + rs.getLong(4));
    }

}
