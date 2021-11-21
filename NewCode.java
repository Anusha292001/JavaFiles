public class NewCode{
	public static void main(String[] args){
		int n=144567;
		
		int r=0,finalno=0;
		while(n>0){
			r=n%10;//7
			n=n/10;//14456
			finalno=(finalno)+r;//7
		}
		System.out.println(finalno);
	}
}