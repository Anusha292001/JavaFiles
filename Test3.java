 import java.util.Scanner;
 class Test3{
	public void getMultiplesOfThree(){
		//Scanner sc=new Scanner(System.in);
		int n=20;
		
		for(int i=0;i<=n;i++){
			/* if(i%3==0){ 
				
			}else{
				System.out.println(i);
			}*/
			if(i%3!=0){	
			System.out.println(i);
			}
			
		}		
	}
	public static void main(String anu[]){
		Test3 ramu=new Test3();
		ramu.getMultiplesOfThree();
		
	}
}