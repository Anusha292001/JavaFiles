import java.util.Scanner;
public class ArmStrong{
	public static void main(String[] args){
		System.out.println("enter n value");
		Scanner anu=new Scanner(System.in);
		int n=anu.nextInt();
		int c=0,a,temp;
		temp=n;
		while(n>0){
			a=n%10;  //153%10=3
			n=n/10;  //153/10=15.3
			c=c+(a*a*a);  //3+3+3=9
			
		}
		if(temp==c){
			System.out.println(" armstrong number");
			
		}else{
			System.out.println(" not armstrong number");
			
		}
		
	}
}