public class Hall extends Room{
	int length;
	
	public Hall(int height, int width, int length) {
		super(height,width);
		this.length = length;
	}
	
	public Hall(int width, int length) {
		super(width);
		this.length = length;
	}

 int voulume() {
	 return length*height*width;
 }
	public static void main(String[] args) {
		Hall hall=new Hall(2, 3, 4);
		System.out.println("Area is : "+hall.area()+" cm 2");
		System.out.println("Volume is : "+hall.voulume()+" cm 3");
		
		Hall hall1=new Hall(1,2);
		System.out.println(hall1.area());
		System.out.println(hall1.voulume());
	}

}
class Room{
	int height, width;

	public Room(int X, int Y) {
		height = X;
		width = Y;
	}
	
	public Room(int z){
		height=10;
		width=z;		
	}
	int area() {
		return height*width;
	}
}