package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.adminMain.CommonCon;

public class UserViewProduct 
{
	public static void viewProduct()
	{
		try
		{
			Connection con=CommonCon.getConnection();
			
			PreparedStatement pstm=con.prepareStatement("select * from product");
			
			ResultSet rs=pstm.executeQuery();
			
			while(rs.next())
			{
				System.out.println("Product id is:"+rs.getInt(1));
				System.out.println("Product Details is:"+rs.getString(2));
				System.out.println("Product Name is:"+rs.getString(3));
				System.out.println("Product Price is:"+rs.getString(4));
				System.out.println("Product Quantity is:"+rs.getString(5));
				System.out.println("\n*****************");
			}
			
			con.close();
			pstm.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
}
