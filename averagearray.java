import java.util.Scanner;
public class averagearray {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[]a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
		            
 }
int sum=0;
for(int i=0;i<n;i++)
{
sum+=a[i];
}
 double avg=(double)sum/n;
System.out.printf("%.2f",avg);
	}
}
