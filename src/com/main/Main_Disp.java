package com.main;
import java.util.Scanner;
import com.user.*;
import com.adminMain.*;
public class Main_Disp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner x=new Scanner(System.in);		
		int ch,pd,uo;
		
		do {
		System.out.println("******** >> Welcome To Ecommerse Application << ********");
		
		
		System.out.println("\n 1-Registered User  \n 2-Admin \n 3-Guest User \n 4-Exit");
		
		System.out.println("Please Select your Status");
		ch=x.nextInt();
		
		switch(ch)
		{
		case 1:
            do
            {
            	System.out.println("****User Operation*****");
            	System.out.println("\n 1-User Registration \n 2-User Login \n 3-View Product Item as Sorted Order \n 4-Buy Product \n 5-View Cart \n 6-Purchase Item \n 7-Exit");
            	System.out.println("Select Your Choice");
            	uo=x.nextInt();
            	
            	switch(uo)
            	{
            	case 1:
            		System.out.println("Enter the First Name:");
            		String Fname=x.next();

            		System.out.println("Enter the Last Name:");
            		String Lname=x.next();

            		System.out.println("Enter the User Name:");
            		String Username=x.next();

            		System.out.println("Enter the Password:");
            		String Password=x.next();

            		System.out.println("Enter the City Name:");
            		String City=x.next();

            		System.out.println("Enter the Email:");
            		String Email=x.next();

            		System.out.println("Enter the Phone Number:");
            		String Phone=x.next();
            		
            		 User_Registration.insertUserDetails(Fname, Lname,Username,Password,City,Email,Phone);
            		break;
            	case 2:
            		break;
            	case 3:
            		break;
            	case 4:
            		break;
            	case 5:
            		break;
            	case 6:
            		break;
            	case 7:
            		System.out.println();
            		break;
            	default:
            		System.out.println("Wrong choice Enter again");
            	}
            }while(uo!=7);
			
			break;
			
		case 2:
			do {
			System.out.println("\n 1-Add Product item \n 2-Calculate Bill \n 3-Display Amount To End User "
					+ "\n 4-Check Quantity  \n 5-check Registered Users \n 6-Check The Particular History \n 7-Exit");
			
			System.out.println("Select your choice");
			pd=x.nextInt();
			
			 
			 
			 switch(pd)
			 {
			 case 1:
			
				 Scanner y=new Scanner(System.in);
				
                 
					System.out.println("Enter the Product Price");
					int price=y.nextInt();
					
					System.out.println("Enter the Product Description");
					String description=x.next();
					
					System.out.println("Enter the Product Quantity");
					int qty=y.nextInt();
					
					System.out.println("Enter the Product Name");
					String name=y.next();

					
					InsertRecord.insertProduct(description,name,price,qty);
                  
				 break;

			 case 2:
				 break;
			 case 3:			 
				 break;
			 case 4:
				 
				 System.out.println("Enter the Product ID:");
				 int id=x.nextInt();
				 
				 CheckQuantity.quantity(id);
				 break;
			 case 5:				 
				 break;
			 case 6:				 
				 break;				 
			 case 7:
				 System.out.println();
				 break;
			default:
				System.out.println("Enter the Wrong Choice Enter again");	 
			 }
			}while(pd!=7);
			
			break;
			
		case 3:
			break;		
		case 4:
			System.out.println("\n\n *****THank You*****");
			break;
		default:
			System.out.println("Wrong choice enter again");
		
		}
		}while(ch!=4);
		
	}

}
