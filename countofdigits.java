import java.util.*;

public class countofdigits {
	public static void main(String[] args) {
		
	
	Scanner s=new Scanner(System.in);
	int n=123456;
	int c=0;
	
	while(n>0) {
		n=n/10;
		
		c++;
	}
	System.out.println(c);

}
}
