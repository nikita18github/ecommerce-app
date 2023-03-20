package com.user;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.adminMain.*;
import java.util.Scanner;
public class UserRegistration 
{
	public static void insertUserDetails()
	{
		try
		{
			Scanner x=new Scanner(System.in);
			
			System.out.println("Enter the First Name:");
    		String Fname=x.next();
    		System.out.println("Enter the Last Name:");
    		String Lname=x.next();
    		System.out.println("Enter the User Name:");
    		String Username=x.next();
//    		x.next();
    		System.out.println("Enter the Password:");
    		String Password=x.next();
//    		x.next();
    		System.out.println("Enter the City Name:");
    		String City=x.next();
//    		x.next();
    		System.out.println("Enter the Email:");
    		String Email=x.next();
//    		x.next();
            System.out.println("Enter the Phone Number:");
    		int Phone=x.nextInt();
    	
    		

    		Connection con=CommonConnection.getConnection();
			PreparedStatement pstm=con.prepareStatement("insert into userdetails (FNAME,LNAME,USERNAME,UserPassword,CITY,EMAIL,PHONENO)values(?,?,?,?,?,?,?)");
			
			pstm.setString(1, Fname);
			pstm.setString(2,Lname);
			pstm.setString(3,Username);
			pstm.setString(4,Password);
			pstm.setString(5,City);
			pstm.setString(6,Email);
			pstm.setInt(7,Phone);
			
			
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
//	public static void main(String []args)
//	{
//		insertUserDetails();
//	}
}
