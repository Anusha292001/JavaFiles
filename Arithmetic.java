import java.io.*;
class Arithmetic 
{
	public static void main(String args[])throws IOException{
			int c;
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter the a value:");
			
			int a=Integer.parseInt(br.readLine());
			System.out.println("enter the b value:");
			int b=Integer.parseInt(br.readLine());
			System.out.println("1.addition");
			System.out.println("2.substraction");
			System.out.println("3.multiplication");
			System.out.println("4.division");
			System.out.println("5.modulo division");
			int choice=Integer.parseInt(br.readLine());
			switch(choice){
				case 1:c=a+b;
				System.out.println("addition of two numbers:"+c);
				break;
				case 2:c=a-b;
				System.out.println("substraction of two numbers:"+c);
				break;
				case 3:c=a*b;
				System.out.println("multiplication of two numbers:"+c);
				break;
				case 4:c=a/b;
				System.out.println("division of two numbers:"+c);
				break;
				case 5:c=a%b;
				System.out.println("modulodivision of two numbers:"+c);
				break;
				default:
				System.out.println("enter your invalid choice");
			}
			
	}
}