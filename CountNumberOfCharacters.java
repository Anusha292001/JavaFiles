import java.util.Scanner;
public class CountNumberOfCharacters{
	public static void xYz(String name1){
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter ur own string:");
		String name=sc.nextLine();
		
		int count=0;
		for(int i=0;i<name.length();i++){
			
			char chars1=name.charAt(i);
			
		
				if(chars1==name1.charAt(0)){
					count++;
				}
			
		}
			if(count>1){
				
				System.out.println(" repeated "+count+" times");
			}
	}
	
}
		

		
		
					
					
				
				
	
			
				
		
					
					
					
				
					
			
			
		
		