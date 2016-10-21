
public class Leader {
  public static void main (String args[]){
	  int a[]={16,17,4,3,5,2};
	  int b=0,j;
	  
	  for(int i=0;i<=5;i++){
		  b=a[i];
		  
		  for (j=i+1;j<=5;j++){
			  if(b<=a[j])
			  {
				 break;
				 }
			  
			  }
		  System.out.println(""+j);
		  if(j==6){
			  System.out.println(b);
		  }
		
	   
  }
}
}