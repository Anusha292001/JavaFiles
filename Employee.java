public class Employee{
	int ID;
	String name;
	public Employee (int x,String y){
		ID=x;
		name=y;
	}
	public String toString(){
		 return ID+" "+name;
	}
	public static  void main(String[] args){
		Employee employee=new Employee(1,"anu");
		System.out.println(employee);
		
	}
}
