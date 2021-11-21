import java.util.Scanner;
import java.util.Arrays;
public class Day4NumberToAlphabet{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] chars=str.toCharArray();
		
		if(n>=26){
			System.out.println("there is no alphabet");
			
		}else {
			System.out.println(chars[n-1]);
		}
		// for(int i=0;i<str.length();i++){
		// char a=str.charAt(i);
		// if(){
			// System.out.println("");
			
		// }
		
		// System.out.println(a);
		// }
		
		
		// another method
		// for(int i=0;i<n;i++){
		// char m=str.charAt(i);
		// if(n>25){
			// System.out.println("there is no alphabet");
			
		// }else {
			// System.out.println(m);
		// }
		// }
		
		
	}
	
}