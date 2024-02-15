package com.example.configuration;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnectionTest {

	public static void main(String[] args) {
		
		/*
		  String JdbcURL =
		 "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		 
		 */
		
		String JdbcURL = "jdbc:mysql://localhost:3306/jcdatabase?useSSL=false";
	    
	    String Username = "raghu";
        String password = "raghu@11";
	      Connection con = null;
	      try {
	    	 Class.forName("com.mysql.cj.jdbc.Driver");  
	         con = DriverManager.getConnection(JdbcURL, Username, password);
	         System.out.println("Connected to MySQL database");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      
	}

}
