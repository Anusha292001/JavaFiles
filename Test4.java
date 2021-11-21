import java.util.Scanner;
class Test4{
	public  int getSum(){
		int n=5,c=0;
		for(int i=0;i<=n;i++){
			c=c+i;
		}
			return c;
		
	}
		public static void main(String args[]){
			Test4 anu=new Test4();
	
			System.out.println(anu.getSum());
		}
	}
