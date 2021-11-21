import java.util.Scanner;
public  class ReverseNumber{
	public int getReverseNo(){
		//int n=Integer.parseInt(args[0]);
		int b,r=0;
		//Scanner sc=new Scanner(System.in);
		System.out.println("\n enter any Number:");
		//int n=sc.nextInt();
		int n=34;
		while(n>0){//72
			b=n%10;//b=2,b=7
			r=r*10+b;//r=2,27
			n=n/10;//n=7
		}
		return r;
	}
		public static void main(String args[]){
			ReverseNumber see=new ReverseNumber();
	
		System.out.println(see.getReverseNo());
		}
		
	
}