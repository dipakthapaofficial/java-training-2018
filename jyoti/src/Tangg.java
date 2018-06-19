
public class Tangg {

	public static void main(String[] args) {
	int	a[]= {1,2,3,4,5,6,7,8,9,10};
	int sum=0;
	for(int i=0;i<9;i++) {
		for(int j=0;j<9;j++) {
			sum=a[i]+a[j];
			if(sum==7)
			{
				System.out.println(a[i]+ " "+a[j]);
			}
			else {
				for(int k=0;k<9;k++) {
					if(sum+a[k]==7) {
						System.out.println(a[i]+" "+a[j]+ " "+a[k]);
					}
				}
			}
		}
	}
			
		// TODO Auto-generated method stub

	}
	
	

}
