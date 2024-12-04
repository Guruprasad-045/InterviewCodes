import java.util.*;
public class specialcharcterscountvowels {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s= scanner.nextLine();
		 int v = 0, c = 0, sp = 0;
		 for(int i=0;i<s.length();i++) {
		 char ch=s.charAt(i);
		if (ch >= 65 && ch <= 90||ch>=97&&ch<=122){
		 if (!(ch != 'a' && ch != 'e' && ch != 'i'&&ch != 'o' &&ch != 'u' &&ch != 'A' &&ch!='E'&&ch != 'I' && ch != 'O'&& ch != 'U')) {
		  v++;
		 } 
		 else
		  {
		   c++;
		   }
		}
		 else if (ch >= 48 && ch <= 57)
		{ 
		   continue;
		  }
		      else {
		     sp++;
		         }
		        
		        }

		     
		 
		  System.out.println("Consonants: " + c);
		  System.out.println("Vowels: " + v);
		  System.out.println("Special Characters: " + sp);

		  
		    }
}
