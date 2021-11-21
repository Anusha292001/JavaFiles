import java.util.Scanner;
public class Test{
	public void getNumber(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		for(int i=1;i<=n;i++){
			
		System.out.println(+i);
		}
	}
	static public void main(String[] Anu){
		Test anu=new Test();
		anu.getNumber();
	}
		
	
}