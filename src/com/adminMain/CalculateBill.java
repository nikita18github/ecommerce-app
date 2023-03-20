package com.adminMain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CalculateBill {
	
	private String uname;
	public static void totalAmount(String uname)
	{
		Connection con=CommonCon.getConnection();
		
		try {
			
			PreparedStatement pstm=con.prepareStatement("select * from cart where UserName = ? order by Date desc limit 1");
			pstm.setString(1, uname);
			ResultSet rs=pstm.executeQuery();
			while(rs.next())
			{
				int bill=rs.getInt("TotalAmount");
				System.out.println("Total bill=  "+bill);
			}
		
			
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//pstm.setString(1, );
		
	}
	

}
