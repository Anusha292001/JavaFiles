import java.io.*;
class Fibonacci
{
	
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i,a=1,b=1,c=0,n;
		System.out.println("enter the value of n:");
		n=Integer.parseInt(br.readLine());
		System.out.println("the fibonacci series of given number is:");
		System.out.println(" "+a);
		System.out.println(" "+b);
		for(i=0;i<n-2;i++){
			c=a+b;
			a=b;
			b=c;
			System.out.println(" "+c);
		}
		System.out.println();
		System.out.println(n+"the value of the given series is:"+c);
		
		
		
	}
}