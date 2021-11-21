  class MyClass extends Thread{
	public void run(){
		for(int i=1;i<=3;i++){
				System.out.println(i);
		}
	}
}
 class Example{
	public static void main(String args[]){
		
		MyClass a=new MyClass();
		a.start();
		System.out.println("success");
		
	}
}