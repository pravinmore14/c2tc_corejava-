package BankingProject;
import java.awt.Container;
import java.util.Scanner;

public class BankCode{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to ICICI BANK");
		
		   Scanner Sc = new Scanner(System.in);
		      System.out.println("Enter your Age"); 		  
		      int age =Sc.nextInt();
		      if (age >=18) {
		    	  System.out.println("Congratulation you are eligible to open new ICICI bank account");   
		      } 
		      else {
		    		  System.out.println("Sorry ,you are not eligible to open new ICICI bank account");	
		      
	 } 
		   	    
		    System.out.println("Please select your Options");
			  // System.out.println("Enter your Option"); 
		         System.out.println("1.Saving account");
				 System.out.println("2.Current account");
				 System.out.println("3.Salary account");
				 System.out.println("4.Deposit Money");
				 System.out.println("5.Withdraw Money");
				 System.out.println("6.Check balence");
				   int  option;
				   String name,gender;
				   int Age;
				   int ContactNumber;
				   int AdharNumber;
				  float  balance;
				  float a=0;
					float ammount;
				ammount=a;
				  	Scanner sc1 = new Scanner(System.in);
				 	 option =sc1.nextInt();
				 	Scanner Sc1 = new Scanner(System.in);
				 	
				 	//Saving account
				 	
				     if ( option ==1) {
				   	  System.out.println("Enter Name");
				   	  name=sc1.next();
				   	System.out.println("Enter gender");
				   	  gender=sc1.next(); 
				   	System.out.println("Enter Age");
				   	  Age=sc1.nextInt();
				   	System.out.println("Enter contact number");
				   	ContactNumber=sc1.nextInt();  
				   	System.out.println("Enter Adhar number");
				    AdharNumber=sc1.nextInt(); 	  
					System.out.println("Your saving account created successfully"); 
					
				    }
				     
				     //Current account
				     
				     if ( option ==2) {
					   	  System.out.println("Enter Name");
					   	  name=sc1.next();
					   	System.out.println("Enter gender");
					   	  gender=sc1.next(); 
					   	System.out.println("Enter Age");
					   	  Age=sc1.nextInt();
					   	System.out.println("Enter contact number");
					   	ContactNumber=sc1.nextInt();  
					   	System.out.println("Enter Adhar number");
					    AdharNumber=sc1.nextInt(); 	  
						System.out.println("Your Current account created successfully");   	  
					    } 
				    
				     //Salary account
				     
				     if ( option ==3) {
					   	  System.out.println("Enter Name");
					   	  name=sc1.next();
					   	System.out.println("Enter gender");
					   	  gender=sc1.next(); 
					   	System.out.println("Enter Age");
					   	  Age=sc1.nextInt();
					   	System.out.println("Enter contact number");
					   	ContactNumber=sc1.nextInt();  
					   	System.out.println("Enter Adhar number");
					    AdharNumber=sc1.nextInt(); 	  
						System.out.println("Your Salary account created successfully");   	  
				 } 

					 // Deposing Amount
				     
				     if ( option ==4) {	
				    	
				     System.out.println("Enter the Depositing Amount");
				     ammount=sc.nextFloat();
				     }else if(ammount<a) {
			           System.out.println("Your Account Balance is:"+a);
				     }
				    
				     //Withdraw Money
				     
				     if( option ==5) {
				     ammount=sc.nextFloat();
				     ammount-=a;			     
				System.out.println("Insufficient fund"+a);	
				    		}else {
				    			ammount-=a;	
				    			System.out.println("withdraw ammount is "+a);
				    		
				     }
				     
	                  //To check Balence
				     
				    	 if ( option==6) {	
				    		System.out.println("balence is "+ammount);
				    	 }
				   
	}
}

