import java.util.Scanner;
public class secondlargest {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++)
		{
		a[i]=s.nextInt();
		}
		int L=Integer.MIN_VALUE;
		int SL=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
		if(a[i]>L) {
		SL=L;
		L=a[i];
		}
		if(a[i]>SL&&a[i]!=L){ 
		SL=a[i];
		}
		}
				
		System.out.print(SL);
			}
		}	

		