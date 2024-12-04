import  java.util.*;
public class stringpallindrome {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
		s2=s1.charAt(i)+s2;
		}
				        		
		if(s2.equals(s1)) {
		System.out.println("Yes");
		}
		else {
		System.out.println("No");
		}
		}

}
