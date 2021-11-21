public class SuperClass extends Tostringclass{
	// public SuperClass(){}
	// int a;
	// String name;
	public SuperClass(int id,String name){
		super(name,id);		
	}
	public void init(){
		System.out.println(super.getName());
		System.out.println(super.getId());
	}
	public static void main(String[] args){
		  SuperClass s=new SuperClass(10,"anu");
		  s.init();
		 // Tostringclass t=new Tostringclass("anu",10);
		 // System.out.println(t);
		
	}
}