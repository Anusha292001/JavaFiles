import java.util.Scanner;
	public class Square{
		public int getAreaOfSquare(int side){
				return side*side;
			}
				public int getPerimeterOfSquare(int side){
			
			
		
		return 4*side;
		}
	
		public static void main(String[] anu){
			System.out.println("enter side of the square");
			Scanner sc=new Scanner(System.in);
			int s=sc.nextInt();
			
			//Square square=new Square();
			//System.out.println("area of square:"+square.getAreaOfSquare(s));

			//System.out.println("perimter of square:"+square.getPerimeterOfSquare(s));
			System.out.println("area of square:"+(s*s));

			System.out.println("perimter of square:"+(4*s));
			
			

		}
	}
			
		
	
