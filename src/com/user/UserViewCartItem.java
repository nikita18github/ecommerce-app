package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.adminMain.CommonConnection;

public class UserViewCartItem 
{
		public static void viewCart()
		{
			try
			{
				Connection con=CommonConnection.getConnection();
				
				PreparedStatement pstm=con.prepareStatement("select * from cart");
				
				ResultSet rs=pstm.executeQuery();
				
				while(rs.next())
				{
					System.out.println("Product id is:"+rs.getInt(1));
					System.out.println("Product Details is:"+rs.getString(2));
					System.out.println("Product Name is:"+rs.getString(3));
					System.out.println("Product Price is:"+rs.getString(4));
					System.out.println("Product Quantity is:"+rs.getString(5));
					System.out.println("Total Amout is:"+rs.getString(6));
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
