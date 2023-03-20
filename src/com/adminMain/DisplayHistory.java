package com.adminMain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayHistory {
	
	
	public static void showHistory(String uname)
	{
		Connection con=CommonConnection.getConnection();
		try {
			PreparedStatement pstm=con.prepareStatement("select * from userhistory where UserName=?");
			pstm.setString(1, uname);
			ResultSet rs=pstm.executeQuery();
			if(rs.next()==false)
			{
				System.out.println("user history not fount !!!!!");
			}
			else
			{
			do
			{
				
					System.out.println("\n");

					System.out.print(rs.getString("Username") + "   ");
					System.out.print(rs.getString("Actions") + "   ");
					System.out.print(rs.getString("dateofactions"));		
					
			}
			while(rs.next());
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);

		}
		
	}
}
