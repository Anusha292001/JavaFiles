import java.util.Scanner;
public class TestOne{	
	public int getFact(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f=1,b=1;
		System.out.println("Before While loop n="+n+",f="+f+",b="+b);
		while(b<=n){
			System.out.println("At Starting of while loop n="+n+",f="+f+",b="+b);
		f=f*b;
		System.out.println("Before Increment in loop i.e after produvt n="+n+",f="+f+",b="+b);
		b++;
		System.out.println("After Increment in loop n="+n+",f="+f+",b="+b);
	
		}
		System.out.println("Final n="+n+",f="+f+",b="+b);
		return f;

	}
	public static void main(String args[]){
		TestOne anu=new TestOne();
		System.out.println(anu.getFact());
	}
	
}