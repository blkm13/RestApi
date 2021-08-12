package com.second_srv.restapi.data;

import com.second_srv.restapi.base.Configs;
import com.second_srv.restapi.base.DataBaseHandler;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;
import java.sql.SQLException;

@RestController
@RequestMapping
public class Controller extends Configs {

    @GetMapping("/payment")
    public Request getTickerInfo(String ticker) throws SQLException, ClassNotFoundException {

        DataBaseHandler dataBaseHandler = new DataBaseHandler();
        ResultSet rs =  dataBaseHandler.getReq(ticker);

        Long revenue = rs.getLong(2);
        Long shares = rs.getLong(3);
        Long assets = rs.getLong(4);

        Request req = new Request(ticker, revenue, shares, assets);
        return req;
    }

}
