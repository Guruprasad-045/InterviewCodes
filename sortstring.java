import java.util.*;
public class sortstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		Arrays.sort(ch);
		String d=new String(ch);
		System.out.print(d);
		  }


}
