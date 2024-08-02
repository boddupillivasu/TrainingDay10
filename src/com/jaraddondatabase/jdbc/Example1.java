package com.jaraddondatabase.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Example1{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the employee id");
        int id = sc.nextInt();
        System.out.println("Enter the employee Name");
        String name=sc.next()+sc.nextLine();
        System.out.println("Enter the employee sal");
        double salary=sc.nextDouble();
        //load or register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url="jdbc:mysql://localhost:3306/vasu";
        String uname="root";
        String pwd="786786";

        Connection con = DriverManager.getConnection(url,uname,pwd);

        //query
        String query="update employee set name=?,salary=? where id=?";
        //creating preparedStatment Object
        PreparedStatement pstmt =con.prepareStatement(query);

        pstmt.setString(1,name);
        pstmt.setDouble(2,salary);
        pstmt.setInt(3,id);

        //execute the query
        int i = pstmt.executeUpdate();

        if(i>0) {
            System.out.println("Record is Updated");
        }else {
            System.out.println("Record not Updated");
        }

        pstmt.close();
        con.close();










    }
}