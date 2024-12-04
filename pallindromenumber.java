import java.util.Scanner;
public class pallindromenumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int t=n;
		int rev=0;
		while(n>0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		if(t==rev) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
