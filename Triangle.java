import java.io.*;
class Triangle{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the n value:");
		int n=Integer.parseInt(br.readLine());
		for (int i=1;i<=n;i++){
			System.out.println("*");
			for (int j=1;j<=i;j++){
				System.out.print(i);
			}
		}
		
		
	}
}