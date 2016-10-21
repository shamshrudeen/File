package AddoccurenceinArray;

public class Addccurence {
	public static void main(String args[]){
	int a[]={9,8,7,7,8,6,5,4,6,5,1,2};
	int c=0;
	for(int i=0;i<=11;i++){
		int b=a[i];
		for(int j=0;j<=11;j++){
			if(b==a[j]&&i!=j){
				if(i>j){
				c=c+a[j];
				}
			}
		}
	 }
	System.out.println(c);
	}
}
