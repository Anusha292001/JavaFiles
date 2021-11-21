public class r{
	public static void main(String[] args){
		int n=53;
		int givennumber=n;
		int temp,reverse=0;
		while(n>0){
			temp=n%10;
			reverse=reverse*10+temp;
			n=n/10;
			
		}
		System.out.println(reverse);
			if(givennumber==reverse){
				System.out.println("palindrome");
				
			}else{
				System.out.println("not");
			}
	}
}