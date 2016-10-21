package Factorial;

public class Duplicatenumber {
	
	  public static void main(String args[])
	  {
	    int a[]={1,2,3,4,5,6,6,7,8};
		int b,c=0;
		for(int i=0;i<=8;i++)
		{
		b=a[i];
		for(int j=0;j<=8;j++)
		{	
		  if(b==a[j]&&i!=j)
		   {
			c=b;
			break;
		    }
		}
	  
	  
		}
	 
System.out.println(c);
		

	}
}
