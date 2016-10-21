package swapitusingvariable;

import java.util.Scanner;

public class Swapno 
{
	 public static void main (String args[])
	  {
	    int x;
	    int y; 
	    int z;
		System.out.println("Enter the two number x and y");
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		y=s.nextInt();
		System.out.println("Before swapping\nx= "+x+"\ny= "+ y);
		
		z=x;
		x=y;
		y=z;
		System.out.println("After swapping\nx="+x+"\ny="+y);
	  
	  
	  }
}
