import java.io.*;
class Factorial
{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n,fact=1,i=1;
			System.out.println("enter the value of n:");
			
			n=Integer.parseInt(br.readLine());
			for(i=1;i<=n;i++){
				fact=fact*i;
			}
			System.out.println("the factorial of given number is:"+fact);
	}
}