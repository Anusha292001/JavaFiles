import java.util.Scanner;
public class Hello1
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		Adder twoAdder=new Adder(a,b);
		System.out.println(twoAdder.getSum());
		Adder threeAdder=new Adder(a,b,c);
		System.out.println(threeAdder.getSum());
	}
}
}