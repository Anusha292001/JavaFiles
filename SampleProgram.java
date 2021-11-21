public class SampleProgram{
	int s=76;
	
	public boolean chkPassOrFail(){
		
		return 6>8;
	}
	
	public String getName(){
		Pavan objPavan=new Pavan();
		Anu objAnu=new Anu();
		String fullName=objPavan.name+objAnu.name;
		
		return fullName;
	}
	public float getNumber(){
		return 7/6f;
		
	}
	
	public void printSomeText(){
		System.out.println("hi prinying text");
	}
	

public static void main(String args[]){
	SampleProgram anu=new SampleProgram();
	anu.s=23;
	Anu obj=new Anu();
	System.out.println(obj.name);
	
	System.out.println(anu.s);
	/*System.out.println(anu.chkPassOrFail());
	System.out.println(anu.getName());
	System.out.println(anu.getNumber());
	anu.printSomeText();*/
	//System.out.println(anu.printSomeText());
	
}
}