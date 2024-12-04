import java.util.*;
public class substring {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		String st=sc.nextLine();
		for(int s=1;s<=st.length();s++) {
		for(int i=0;i<=st.length()-s;i++) {
		String t="";
		for(int j=i;j<s+i;j++) 
		{
		t+=st.charAt(j);
		}
		System.out.println(t);
		}
		}

		}


}
