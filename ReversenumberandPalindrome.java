import java.util.Scanner;

public class ReversenumberandPalindrome
{
  public static void main(String args[])
  {
	  int n,r=0,temp;
	  System.out.println("Enter the value of n");
	  Scanner d=new Scanner(System.in);
	  n=d.nextInt();
	  temp=n;
	  while(n!=0)
	  {
		 r=r*10;
		 r=r+n%10;
		 n=n/10;
		 System.out.println("r at every loop "+r);
		 System.out.println("n at every loop "+n);
		 }
	  System.out.println("reverse number "+r);
	  if (temp==r)
		  System.out.println("reverse number is equal to given input so its palindrome");
	  else
		  System.out.println("reverse number is not equal to given input so its   not palindrome");
  }
}
