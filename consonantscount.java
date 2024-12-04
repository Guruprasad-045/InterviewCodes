import java.util.*;
public class consonantscount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		int c=0;
		for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if((ch>=65&&ch<=90)||(ch>=97&&ch<=122)){
		if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'&&ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U')
		c++;
		}
		}
		System.out.println(c);
		}


}
