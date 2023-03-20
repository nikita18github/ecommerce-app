package com.adminMain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckUserHistory {
	
	public static void userHistory(String uname,String actions)
	{
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();
	    System.out.println(formatter.format(date));  
		
		try {
			
			Connection con=CommonCon.getConnection();
			PreparedStatement pstm=con.prepareStatement("insert into userhistory(UserName,Actions,dateofactions)values(?,?,?)");
			pstm.setString(1,uname);
			pstm.setString(2, actions);
			pstm.setString(3,formatter.format(date));
			
			pstm.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	

}

