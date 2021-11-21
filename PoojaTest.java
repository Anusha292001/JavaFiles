public class PoojaTest{
	public static void main(String[] args){
		
		int n=451467;
		for(int  i=9;i>=0;i--){
			int temp=n;
			while(temp>0){
				int number=temp%10;//7
				if(number==i){
					System.out.print(number);
				}
				temp=temp/10;//45146
			}
			
		}
	}
}