import java.io.*;
import java.util.Scanner;
import java.lang.Integer.*;
class Fee
{
	public static void main(String[] args)
	{
		int e_fee;                                                                          //integer to store user provided exam fee
		final String n[] = {"Indian","Foreigner","NRI","SAARC"};                            //array to store nationalities
		final int e_fee_1[] = {400,100,600};                                                //array to store exam fee
		final String c[]= {"Medical","Dental","Ayurveda"};                                  //array to store cources
		final int ind[] = {200,300,500};                                                    //array to store All_level indian application fee
		final int foreign[]= {400,400,700};                                                 //array to store All_level foreign application fee
		final String al[] = {"UG","UG-Diploma","PG"};                                       //array to store All_levels
		
		System.out.println("Please select the exam fees from the below");
		for(int f=0; f<=2; f++) System.out.println(e_fee_1[f]);
		Scanner sc = new Scanner(System.in);                                               //Reading user input
		e_fee = sc.nextInt();
		if(e_fee==(e_fee_1[0]) || e_fee==(e_fee_1[1]) ||e_fee ==(e_fee_1[2]) )             //Validating exam fee input
		{
		for(int i=0;i<=2;i++)
		{
			if (e_fee==(e_fee_1[2]))
			{
				System.out.println("please select your nationalaity from below");
				System.out.println(n[2]);
				System.out.println(n[3]);
				
				String s1= sc.next();
				
				if ((s1.toUpperCase()).equals("NRI") || (s1.toUpperCase()).equals("SAARC"))
				{
					System.out.println("Total amount of fee is "+e_fee);                        
				    break;                                                                        //calculating total amount for NRI and SAARC
				}
				else
				{
					System.out.println("You have selected invalid option. Please select the valid option");
				    continue;
				}
			}	  		
			 else 
			   if(e_fee==(e_fee_1[i]))
			   {  
				 if (n[i].equals("Indian"))
				  System.out.println("Thanks for choosing your nationality. You belong to "+n[i]+" nationality");
				 else 
			      System.out.println("Thanks for choosing your nationality. You belong to other nationality"+" ("+n[i]+")");	
				  System.out.println("Please choose one of the course from below");
				  for(int k=1; k<=3; k++) System.out.println("select "+k +" for "+ c[k-1]);
				  int st= sc.nextInt();
				  if (st<=0 || st>3)
				  {
					System.out.println("Invalid selection");                                        
					break;                                                                       //To verify the valid courses
				  }
				  else
				    System.out.println("You have selected "+c[st-1]);
				    System.out.println("Choose the qualification level");
				    for(int l=1; l<=3; l++) System.out.println("select "+l +" for "+ al[l-1]);
				    int sl=sc.nextInt();
				   if (sl<=0 || sl>3)
                     System.out.println("Invalid selection");                                    //To verify the valid levels
				   else
				   for(int m=1;m<=3;m++)
			    	{
					System.out.println("Thanks for selecting " +al[sl-1]);
					if (n[i].equals("Indian"))
					System.out.println("The total fee amount is " + (e_fee_1[i]+ind[sl-1]));
					else if (n[i].equals("Foreigner"))
					System.out.println("The total fee amount is " +(e_fee_1[i]+foreign[sl-1]));	//To calculate total fee amount for indian and foreigner
					break;
				    }
		     		break;	
			    }				 
		
	   }
	   }            else
		          	System.out.println("You have selected Invalid Amount");
   }
}
