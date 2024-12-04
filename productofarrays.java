import java.util.Scanner;
class productofarrays {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++){
		a[i]=s.nextInt();}
				
		int product=1;
		for(int i=0;i<n;i++)
		{
		product*=a[i];
		}
		System.out.print(product);	
	}

}
