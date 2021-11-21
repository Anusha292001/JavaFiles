public class NewTriangle extends Shapes{
	public void getColour(){
		System.out.println("traingle colours");
	}
	public void getName(){
		System.out.println("traingle sizes");
	}
	public static void main(String[] args){
		Shapes s=new NewTriangle();
		s.getColour();
		s.getSize();
		
		
	}
}