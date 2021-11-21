import java.util.Scanner;
public class PavanAnna{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			if((i%2==0) && (i%3==0)){
				System.out.println("th");
				
			 
			}else if(i%3==0){
				 System.out.println("h");
			 }else if(i%2==0){
				 System.out.println("t");
				
			 }else{
				 System.out.println(i);
			 }
			
		}
		String name="pavan";
		System.out.println(name.hashcode());
		
	}
	
}
				
			 
			
				
				
			