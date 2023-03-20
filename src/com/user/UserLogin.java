package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.adminMain.CheckUserHistory;
import com.adminMain.CommonCon;

public class UserLogin {
	
	private String uname;
	private String password;
	public static void userLogin(String uname,String password)
	{
		try 
		{
		Connection con=CommonCon.getConnection();
		PreparedStatement pstm=con.prepareStatement("select * from userdetails where USERNAME=?");
		pstm.setString(1,uname);
	
		
		ResultSet rs=pstm.executeQuery();

		if(rs.next()==false)	{
			System.out.println("Invalid Credentials");
		}
		else {
		//while(rs.next())
		//{
			
			if(uname.equals(rs.getString("USERNAME"))) 
			{
				if(password.equals(rs.getString("UserPassword")))
				{
					System.out.println("Successfully login");
					//break;
				}
				else
				{
					System.out.println("Invalid Credentials");
				}
			}
			else
			{
				System.out.println("Invalid username");
				//break;
			}
			
		//}
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("login issue" +e);
		}
		CheckUserHistory.userHistory(uname,"user login action");
		
	}
	

	
	private static String getString(int i) {
		 // TODO Auto-generated method stub
		return null;
	}

}
