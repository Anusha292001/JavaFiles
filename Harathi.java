class Anu implements AnushaI,AsmaI{
	public void getSha(){
		System.out.println("g,o,g");
		
	}
	public void getNumber(){
		System.out.println("g,o,g");
	}
	
	public void getName(){
		System.out.println("Anuuu");
	}
	
}
class Harathi implements AsmaI{
	public void getKeerthi(){
		System.out.println("pooja");
	}
	public void getName(){
		System.out.println("pooja");
	}
	
	public static void getPriya(String classname)throws Exception{
		AnushaI anusha=(AnushaI)Class.forName(classname).newInstance();
		anusha.getNumber();
		anusha.getName();
	}
	
	public static void getPriya1(String classname)throws Exception{
		AsmaI anusha=(AsmaI)Class.forName(classname).newInstance();
		anusha.getName();
	}
	
	
	public static void main(String[] pavan)throws Exception{
		getPriya("Anu");
		getPriya1("Harathi");
		
	}
}
/* interface AnushaI{ 
	void getNumber();
	void getName();
}
interface AsmaI{
	void getName();
}*/


	
	
