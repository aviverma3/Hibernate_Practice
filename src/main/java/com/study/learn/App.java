package com.study.learn;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       String jdbcUrl = "jdbc:mysql://localhost:3306/avinash?allowPublicKeyRetrieval=true&useSSL=false";	
       String user = "hbstudent";
       String password = "hbstudent";
       try {
    	   System.out.println("connection to database:"+jdbcUrl);
    	   Connection myconn = DriverManager.getConnection(jdbcUrl, user, password);
    	   System.out.println("connection successful!!!!");
       }
       catch(Exception exc) {
    	   exc.printStackTrace();
       }
    }
}
