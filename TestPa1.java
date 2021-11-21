public class TestPa1{
	private TestPa1(){
		System.out.println("haloo pavan i'm from constructor");
	}
	public static void callDummy(){
		System.out.println("haloo pavanuuuuuuuuuuuuu I'm from ststic block");
	}
	
	public static void main(String[] asd){
		D.callDummy();
		callDummy();
		TestPa1 gg=new TestPa1();
		gg.callDummy();
		
	}
	
}
	class D{
		
		private D(){}
		public static void callDummy(){
		System.out.println("haloo pavanuuuuuuuuuuuuu I'm from ststic block..........clssD");
	}
	}