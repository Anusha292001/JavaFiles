import java.util.Scanner;
public class Day5Digit3{
	public static void main(String[] args){
		UsingToString u=new UsingToString(10,"Anuusha");
		System.out.println(u.getId());
		System.out.println(u.getName());
		System.out.println(u.toString());
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		 for(int i=2;i<=n;i++){
			 int a=i;
			while(a>0){
				if(a%10==3){
					count++;
					
				
				
					
				System.out.println(i);
				}
				a=a/10;
			}
			
	 }
	}
}