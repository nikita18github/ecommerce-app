package com.adminMain;

import java.sql.Connection;
import java.sql.DriverManager;

public class CommonCon {

   public static Connection getConnection()
   {
	   Connection con=null;
	   try
	   {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   
		   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/schema_2", "root","@#Pavan@#More%");
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   return con;
   }

}
