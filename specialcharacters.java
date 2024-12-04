import java.util.*;
public class specialcharacters {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int c=0;
		for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(!(ch>=65&&ch<=90)&&!(ch>=97&&ch<=122)&&!(ch>=48&&ch<=57)&&!(ch==' ')) 
		{
		System.out.println(ch+" ");
		c++;
		}
		}
		}

}
