package com.adminMain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.main.Main_Disp;

public class CheckRegisteredUser 
{
	String s;
	
	public static void checkUser(String username)
	{
		try {
		
		Connection con=CommonCon.getConnection();
		
		PreparedStatement pstm=con.prepareStatement("select * from userdetails where username=?");
		pstm.setString(1, username);
		
		ResultSet rs=pstm.executeQuery();
		//int count=0;
		if(rs.next()==true)
		{
				System.out.println("registered user!!!!!!!!! ");
		}
		else
			{
				System.out.println("user not registered!!!!!please complete registration first!!");
			}
		
       } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	

}
