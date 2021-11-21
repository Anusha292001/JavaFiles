import java.util.Scanner;
public class Perimeter{
	public int getPerimeterOfSquare(int side){
		 System.out.println("enter side of the square");
			Scanner sc=new Scanner(System.in);
			int s=sc.nextInt();
			return 4*side;
			
	}
	public  static void main(String anu[]){
		Perimeter perimeter=new Perimeter();
		System.out.println(perimeter.getPerimeterOfsquare(5));
		
		
		
	}
}