package com.second_srv.restapi.base;

import java.beans.Statement;
import java.sql.*;

public class DataBaseHandler extends Configs {
    Connection dbConect;


    public Connection getDbConect() throws ClassNotFoundException, SQLException {

        String connectionString = "jdbc:mysql://" +
                    dbHost + ":"
                + dbPort + "/" + dbName;
        Class.forName("com.mysql.cj.jdbc.Driver");

        dbConect = DriverManager.getConnection(connectionString, dbUser, dbPass);

        return dbConect;
    }


    public ResultSet getReq (String ticker) throws SQLException, ClassNotFoundException {

        String sql = "SELECT * FROM XNAS WHERE TICKER = ?";

        PreparedStatement pstmt = getDbConect().prepareStatement(sql);
        pstmt.setString(1, ticker);
        ResultSet rs = pstmt.executeQuery();

        rs.next();

        return rs;
    }
}
