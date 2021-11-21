public class Child extends Parent{
	public void getJob(){
		this.getHouse();
		System.out.println("job");
	}
	
	public void getHouse(){
		super.getHouse();
		System.out.println("house from child");
	}
	public static void main(String[] anu){
		Child child=new Child();
		child.getJob();
		
		child.getHouse();
		child.getLand();
		System.out.println("=============================================");
		Parent parent=new Parent();
		parent.getLand();
		parent.getHouse();
		
		
		
	}
}