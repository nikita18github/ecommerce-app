package com.main;
import java.util.Scanner;
import com.user.*;
import com.Guest.ViewProduct;
import com.adminMain.*;
public class MainDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner x=new Scanner(System.in);		
		int ch,pd,uo,vpg;
		
		do {
		System.out.println("******** >> Welcome To Ecommerse Application << ********");
		
		
		System.out.println("\n 1-User Operation  \n 2-Admin Operation \n 3-Guest Operation \n 4-Exit");
		
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
            		System.out.println("*****Enter Details******");
            		  UserRegistration.insertUserDetails();
            		break;
            	case 2:
            		break;
            	case 3:
            		System.out.println("*********Available Product List*******");
            		UserViewProduct.viewProduct();
            		break;
            	case 4:
            		System.out.println("******Buy/Add to cart Product********");
            		
            		System.out.println("Enter the product id:");
            		int id=x.nextInt();
            		
            		System.out.println("Enter the Quantity:");
            		int qty=x.nextInt();

            		System.out.println("Enter the User Name:");
            		String UserName=x.next();
            		
            		
            		GainInfoFromProduct.ProductInfo(id,qty,UserName);
            		break;
            	case 5:
            		System.out.println("*********Cart Item*********");
            		UserViewCartItem .viewCart();
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
				System.out.println("*****Admin Operation*****");
			    System.out.println("\n 1-Add Product item \n 2-Calculate Bill \n 3-Display Amount To End User "
					+ "\n 4-Check Quantity  \n 5-check Registered Users \n 6-Check The Particular History \n 7-Exit");
			
			System.out.println("Select your choice");
			pd=x.nextInt();
			
			 
			 
			 switch(pd)
			 {
			 case 1:
			
//				 Scanner y=new Scanner(System.in);
				
                 
					System.out.println("Enter the Product Price");
					int price=x.nextInt();
					x.nextLine();
					
					System.out.println("Enter the Product Description");
					String description=x.nextLine();
					
					System.out.println("Enter the Product Quantity");
					int qty=x.nextInt();
					x.nextLine();
					
					System.out.println("Enter the Product Name");
					String name=x.nextLine();

					
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
				System.out.println(" Wrong Choice Enter again");	 
			 }
			}while(pd!=7);
			
			break;
			
		case 3:
			do {
				System.out.println("******Guest Operation******");
				System.out.println("\n 1-View Product \n 2-Purchase Item \n 3-Exit");
				vpg=x.nextInt();
				
				switch(vpg)
				{
				case 1:
					System.out.println("*****View Product*****");
					ViewProduct.viewProductAsGuest();
					break;
				
				case 2:
					System.out.println("****Please Register yourself First***");
					UserRegistration.insertUserDetails();
					break;
				case 3:
					System.out.println();
					break;
				default:
					System.out.println("Wrong Choice....Enter Again");
				}
			}while(vpg!=3);
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
