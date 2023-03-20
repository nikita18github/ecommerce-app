package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.adminMain.CheckUserHistory;
import com.adminMain.CommonConnection;

public class GainInfoFromProduct 
{

	public static void ProductInfo(int id,int qty,String UserName)
	{
		try
		{
			Connection con=CommonConnection.getConnection();
			
			PreparedStatement pstm=con.prepareStatement("select * from product where id=?");
			pstm.setInt(1, id);
			
			PreparedStatement pstm2=con.prepareStatement("insert into cart(id,UserName,Details,ProductName,Price,Quantity,TotalAmount,Date) values (?,?,?,?,?,?,?,?)");
			
			ResultSet rs=pstm.executeQuery();
			
			while(rs.next())
			{
				pstm2.setInt(1, rs.getInt(1));
				pstm2.setString(2, UserName);
				pstm2.setString(3, rs.getString(2));
				pstm2.setString(4, rs.getString(3));
				pstm2.setString(5, rs.getString(4));
				
				pstm2.setInt(6, qty);
				int p=Integer.parseInt(rs.getString(4));

				pstm2.setInt(7,p*qty);
				pstm2.setString(8, "**date**");
				System.out.println("Item Added to The Cart List");
		  	
			}
		
			pstm2.execute();
			
			con.close();
			
			
			CheckUserHistory.userHistory(UserName,"user added item actions!");
			pstm.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}


}
