import java.util.Scanner;
public class WhileLoop{
	
	public int getFactNo(){
		//System.out.println("WhileLoop");
		//while(condition){inc/dec}
		/* int i=0;
		while(i<=10){
			System.out.println(i);
			i++;
		} */
		/* int i=10;
		while(i>=1){
			System.out.println(i);
			i--;
		} */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f=1,i=1;
		while(i<=n){
			
			f=f*i;
			//System.out.println("the value of n is:" +f);
			i++;
		}
			System.out.println("the fact of n is:" +f);
			return f;
			
	}
	static public void main(String[] Anu){
		WhileLoop anu=new WhileLoop();
		System.out.println(anu.getFactNo());
	}
	
}