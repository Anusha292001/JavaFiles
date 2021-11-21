public class MultipleBy10{
	public void getNumber(int n){
		for(int i=n;;i++){
			if(i%10==0){
				break;
			}else{
				System.out.println(i);
			}
			
		}
	}		
					
				
			public static void main(String ss[]){
				MultipleBy10 anu=new MultipleBy10();
			anu.getNumber(21);
	 	
			}
	
}