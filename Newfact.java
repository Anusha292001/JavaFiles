import java.util.Scanner;
public class Newfact{
	public static void main(String[] args){
		System.out.println("enter n value");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1,i=1;
		for(i=1;i<=n;i++){
			fact=fact*i;
			System.out.println("factorial is:"+fact);
			
		}
		int l=0,j=1,k;
		System.out.println(l+","+j);
		for(int a=2;a<10;a++){
			k=l+j;
			System.out.println(","+k);
			l=j;
			j=k;
			
		}
		
		
		
	}
}