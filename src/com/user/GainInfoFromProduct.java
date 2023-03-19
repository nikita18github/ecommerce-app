package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.adminMain.CommonCon;

public class GainInfoFromProduct 
{

	public static void ProductInfo(int id,int qty)
	{
		try
		{
			Connection con=CommonCon.getConnection();
			
			PreparedStatement pstm=con.prepareStatement("select * from product where id=?");
			pstm.setInt(1, id);
			
			PreparedStatement pstm2=con.prepareStatement("insert into cart(id,Details,p_Name,Price,Quantity,T_AMT) values (?,?,?,?,?,?)");
			
			ResultSet rs=pstm.executeQuery();
			
			while(rs.next())
			{
				pstm2.setInt(1, rs.getInt(1));
				pstm2.setString(2, rs.getString(2));
				pstm2.setString(3, rs.getString(3));
				pstm2.setString(4, rs.getString(4));
				pstm2.setInt(5, qty);
				int p=Integer.parseInt(rs.getString(4));
				int q=Integer.parseInt(rs.getString(5));
				pstm2.setInt(6,p*q);
				System.out.println("\n********Item Added to The Cart List*****");
		  	
			}
		
			pstm2.execute();
			
			con.close();
			pstm.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}


}
