package com.jaraddondatabase.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO Auto-generated method stub
        //load or register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //define the connection url,username and password
        String url = "jdbc:mysql://localhost:3306/vasu";
        String uname = "root";
        String pwd = "786786";

        //Establish the connection between java program and database
        Connection con = DriverManager.getConnection(url, uname, pwd);

        //Execute the queries
        Statement stmt = con.createStatement();
        //non-select query
       // String query = "insert into tab1 values('areef',13)";
        String query = "delete from tab1 where id=12";
        //executing query
        int i = stmt.executeUpdate(query);

        if (i > 0) {
            System.out.println("Record Inserted");
        } else {
            System.out.println("Record not Inserted");
        }
        stmt.close();
        con.close();
    }
}
