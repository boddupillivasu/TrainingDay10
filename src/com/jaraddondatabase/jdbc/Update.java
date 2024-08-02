//package com.jaraddondatabase.jdbc;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
//
//public class Update {
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        //load or register the driver
//        Class.forName("com.mysql.cj.jdbc.Driver");
//
//        //define the connection url,username and password
//        String url="jdbc:mysql://localhost:3306/nri";
//        String uname="root";
//        String pwd="786786";
//
//        //Establish the connection between java program and database
//        Connection con= DriverManager.getConnection(url,uname,pwd);
//
//        //Execute the queries
//        Statement stmt=con.createStatement();
//        //non-select query
//        String query="insert into employee values(1921,'martin',50000)";
//        //executing query
//        int i=stmt.executeUpdate(query);
//
//        if(i>0) {
//            System.out.println("Record Inserted");
//        }
//        else {
//            System.out.println("Record not Inserted");
//        }
//        stmt.close();
//        con.close();
//    }
//    }
//}
