package com.adminMain;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class InsertRecord {

	public static void insertProduct(String description,String name,int price,int qty)
	{
		try
		{
			Connection con=CommonCon.getConnection();
			
			PreparedStatement pstm=con.prepareStatement("insert into product(Details,P_Name,Price,Quantity)values(?,?,?,?)");
			
			pstm.setString(1,description);
			pstm.setString(2,name);
			pstm.setInt(3,price);
			pstm.setInt(4,qty);
			
			pstm.execute();
			
			System.out.println("Record Inserted....");
			
			con.close();
			pstm.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}


}
