class Overloading{  
  void sum(int a,long b){
	  System.out.println("a method invoked");
	  }  
  void sum(int a,int b){
	  System.out.println("b method invoked");
	  }  
  
  public static void main(String args[]){  
  Overloading obj=new Overloading();  
  obj.sum(20,20);
  }  
}  