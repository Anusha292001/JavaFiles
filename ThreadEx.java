public class ThreadEx{
	public void numbers() throws InterruptedException{
		int n=10;
		for(int i=0;i<=n;i++){
			if(i==6){
			Thread.sleep(10000L);
			}
			System.out.println(i);
			
		}
	}
	public static void main(String[] args) throws InterruptedException{
		ThreadEx thread=new ThreadEx();
		thread.numbers();
		
	}
}