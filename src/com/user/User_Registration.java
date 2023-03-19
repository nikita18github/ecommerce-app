package com.user;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.adminMain.*;

public class User_Registration 
{
	public static void insertUserDetails(String Fname,String Lname,String Username,String Password,String City,String Email,String Phone)
	{
		try
		{
			Connection con=CommonCon.getConnection();
			
			PreparedStatement pstm=con.prepareStatement("insert into user_details (FNAME,LNAME,USERNAME,PASS_WORD,CITY,EMAIL,PHONE_NO)values(?,?,?,?,?,?,?)");
			
			pstm.setString(1, Fname);
			pstm.setString(2,Lname);
			pstm.setString(3,Username);
			pstm.setString(4,Password);
			pstm.setString(5,City);
			pstm.setString(6,Email);
			pstm.setString(7,Phone);
			
			
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
