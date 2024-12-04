import java.util.Scanner;

public class sumofsubarray {
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		}      
		int k=sc.nextInt();
		for(int s=1;s<=n;s++){
		for(int i=0;i<=n-s;i++){
		int sum=0;
		for(int j=i;j<i+s;j++){
		sum+=a[j];
		}
		if(sum==k){
		for(int j=i;j<i+s;j++)
		{
		System.out.print(a[j]+" ");
		}     
		System.out.println();
		 }
				                
		  }
		  }
		}
}


