import java.util.Scanner;
public class Day1StringReverse{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur own string:");
		String name=sc.nextLine();
		String n=name;
		
		String reverse="";
		for(int i=name.length()-1;i>=0;i--){
			 reverse=reverse+name.charAt(i);
		// System.out.print(name.charAt(i));
		}
		System.out.println(reverse);
		//-----------------------------------
		// to print it is palindrome string or not
		if(n==reverse){
			System.out.println("is palindrome");
			
		}else{
			System.out.println("not palindrome");
		}
			 
			
			
			 // if(name==reverse){
				 // System.out.println("true");
			 // }
		
		
		
	}
	
}