import java.util.*;
public class sumofdigits {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n=12345;
	    int sum=0;
	    while(n>0)
	    {
	    	sum+=n%10;
	    	n=n/10;
	    }
	    System.out.println(sum);
		  
		
	}

}
