import java.util.*;
public class stringreverse {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String t="";
		for(int i=str.length()-1;i>=0;i--){
		char ch=str.charAt(i);
		t+=str.charAt(i);
		}
		System.out.println(t);
			}
		}
