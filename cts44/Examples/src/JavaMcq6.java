import java.util.Scanner;
public class JavaMcq6 {

	public static void main(String[] args) {

	int sum=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a integer value");
	int n=s.nextInt();
	System.out.println("Enter elements into an array");
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
	a[i]=s.nextInt();
	}
	for(int i=0;i<n;i++)
	{
	sum=(int)(sum+Math.pow(a[i], i));
	}
	System.out.println("power of each individual element is :"+sum);
	}

	}


