package Factorial;

import java.util.Scanner;

public class Fact {
	public static void main (String args[]){
	int i,fact=1;
			int n;
	System.out.println("Enter the value of n");
	Scanner d=new Scanner(System.in);
	n=d.nextInt();
	for(i=1;i<=n;i++){
	fact=i*fact;
	System.out.println("value of fact at every loop" +fact);
	}
	
	System.out.println(fact);
		
		
	}

}
