package com.adminMain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CheckQuantity {

	public static void quantity(int id)
	{
		try
		{
			Connection con=CommonCon.getConnection();
			
			PreparedStatement pstm=con.prepareStatement("select Quantity from product where id=?");
			
			pstm.setInt(1, id);
			
			ResultSet rs=pstm.executeQuery();
			
			
			
			while(rs.next())
			{
				System.out.println("Product Quantity is:"+rs.getInt(1));
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
