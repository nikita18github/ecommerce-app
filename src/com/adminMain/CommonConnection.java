package com.adminMain;

import java.sql.Connection;
import java.sql.DriverManager;

public class CommonConnection {

   public static Connection getConnection()
   {
	   Connection con=null;
	   try
	   {
		  // Class.forName("com.mysql.cj.jdbc.Driver");
		   
		   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root","root");
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   return con;
   }

}
