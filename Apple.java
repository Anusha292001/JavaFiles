import java.util.*;
public class Apple{
	
	public static void main(String[] args){
	//	char[] s=sc.toCharArray();
		int count=0;
		Scanner sc=new Scanner(System.in);
		String name1=sc.nextLine();
		 for(int i=0;i<name1.length();i++){
		char c=name1.charAt(i);
		//String name2=sc.nextLine();
		// System.out.println(name2.length());
			 if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
		System.out.println(c);
				 count++;
			 }
		 }
		System.out.println(count);
		
			
		
			
		
		
	}
}