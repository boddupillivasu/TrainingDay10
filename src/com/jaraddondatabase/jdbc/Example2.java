package com.jaraddondatabase.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Example2 {




        public static void main(String[] args) throws ClassNotFoundException, SQLException {
            //load or register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //configure url,username and password
            String url="jdbc:mysql://localhost:3306/vasu";
            String uname="root";
            String pwd="786786";

            //establish the connection
            Connection con = DriverManager.getConnection(url,uname,pwd);
            //create the statement object and execute the queries
            Statement stmt =con.createStatement();
            //update query
            String query="delete from employee where id=13";

            //non-execute query;
            int i =stmt.executeUpdate(query);

            if(i>0) {
                System.out.println("Record Deleted");
            }else {
                System.out.println("Record  is not deleted");
            }

            stmt.close();
            con.close();
















        }

    }


