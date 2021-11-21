import java.util.Scanner;
public class SwitchProgram {
	public static void main(String... args){
		Scanner sc=new Scanner(System.in);
		
		char c=sc.next().charAt(0);
		switch(c){
			case 'p':System.out.println("pavan");
					//break;
			case 'a':System.out.println("anu");
					//break;
			default:System.out.println("Stupid");
			//break;
		}
	}
	
	
}
