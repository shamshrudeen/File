import java.util.*;
class Multiplication
{
     public static void main(String args[])
	        {   
			      int a,b,c,d;
				  System.out.println("Enter the two Multiplication table");
				  Scanner s=new Scanner (System.in);
				  a=s.nextInt();
				  b=s.nextInt();
				  System.out.println("Multiplication table for"+a);
				  for (c=1;c<=10;c++)
				       {
				            System.out.println(a+"*"+c+" = "+(a*c));
				  
				 
				        }
					for (d=1;d<=10;d++)	
					        {
						 
						 
						 System.out.println(b+"*"+d+" = "+(b*d));
						 
						     }
			
			
			
			
			
			}

}