class Test{
	static int x=10;
	static void Display(){
		System.out.println(x);
	}
}
class Demo12{
	public static void main(String[] args){
		Test a,b;
		a=new Test();
		b=new Test();
		++a.x;
		System.out.println("x in a:");
		a.Display();
		System.out.println("x in b:");
		b.Display();
			
	}
}