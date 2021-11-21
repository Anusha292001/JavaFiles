/* 1,1,2,3,5,8,13,21.... */
import java.util.Scanner;
public class FibbonacciSeries{
	public int getFib(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1,b=1,count=2,fib=0;
		System.out.print("1,1");
		while(count<n){
			//System.out.println("Starting while loop a="+a+", b="+b+", count="+count+", n="+n+", fib="+fib);
				fib=a+b;
				//System.out.print(","+fib);
				//System.out.println("After fibnocci    before count a="+a+", b="+b+", count="+count+", n="+n+", fib="+fib);
				count++;
				//System.out.println("After count a="+a+", b="+b+", count="+count+", n="+n+", fib="+fib);
				a=b;
				b=fib;
				System.out.println("Afetr exchange of values a="+a+", b="+b+", count="+count+", n="+n+", fib="+fib);
		}
		return fib;
		
	}
	public static void main(String args[]){
		FibbonacciSeries anu=new FibbonacciSeries();
		System.out.print(anu.getFib());
		
		
	}
	
}