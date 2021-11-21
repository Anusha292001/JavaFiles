import java.io.*;
class Palindrome{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the sring to check fro palindrome:");
		string s1=br.readLine();
		StringBuffer sb=new StringBuffer();
		sb.append(s1);
		sb.reverse();
		string s2=sb tostring();
		if(s1equals(s2)){
			System.out.println("palindrome");
		}else{
			
			System.out.println("notpalindrome");
		}
		
	}
}