package com.second_srv.restapi;

import com.second_srv.restapi.base.DataBaseHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.ResultSet;
import java.sql.SQLException;

@SpringBootApplication
public class RestApiApplication {
    public static void main(String[] args){
        SpringApplication.run(RestApiApplication.class, args);
    }
}
