class A extends Thread{
	public void run(){
		System.out.println("thread A started");
		for(int i=1;i<=4;i++){
			System.out.println("from thread A:i="+i);
			}
		System.out.println("exit from A");
	}
}
class B extends Thread{
	public void run(){
		System.out.println("thread B started");
		for(int j=1;j<=4;j++){
			System.out.println("from thread B:j="+j);
			}
		System.out.println("exit from B");
	}
}
class C extends Thread{
	public void run(){
		System.out.println("thread C started");
		for(int k=1;k<=4;k++){
			System.out.println("from thread C:k="+k);
			}
		System.out.println("exit from C");
	}
}
class ThreadPriority{
	public static void main(String args[]){
		
		A threada=new A();
		B threadb=new B();
		C threadc=new C();
		threadc.setpriority(Thread.MAXPRIORITY);
		threadb.setpriority(Thread.getpriority()+1);
		threada.setpriority(Thread.MINPRIORITY);
		System.out.println("thread A start");
		threada.start();
		System.out.println("thread B start");
		threadb.start();
		System.out.println("thread C start");
		threadc.start();
		System.out.println("end of main thread");
	}
}