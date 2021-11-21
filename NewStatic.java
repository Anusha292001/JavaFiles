public class NewStatic{
	public NewStatic(){
		System.out.println("i am from constructor block");
		
	}
	
	
	static void getAdd(int a,int b){
		System.out.println("add:"+(a+b));
		
	}
	public static void main(String ...anu){
		System.out.println("i am from main method");
		NewStatic newstatic=new NewStatic();
		newstatic.getAdd(10,20);
		StaticRelated staticRelated=new StaticRelated();
		staticRelated.getname("anusha");
	}
		
	static{
		System.out.println("hlo world i am from static");
	
	}
	
}