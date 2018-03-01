package com.cui.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class localtionDB {

    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/map?useSSL=true";
        String driver = "com.mysql.jdbc.Driver";
        String user = "root";
        String password = "123456";
        Connection con =null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,password);
            if(!con.isClosed())
                System.out.println("connection successful");
                Statement statement = con.createStatement();
                String sql = "select * from marker";
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()){
                    System.out.println(rs.getString(1));
                }
                rs.close();
                statement.close();
                con.close();
        }catch (Exception e){
              e.printStackTrace();
              System.out.println("fail.....");
        }
    }
}
