//import java.io.*;
public class Tables5{
	public static void main(String args[]){
		/*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the n value:");
		int n=Integer.parseInt(br.readLine());
		for(int j=1;j<=20;j++){
			System.out.println(+n+"X"+j+"="+n*j);
			
		}
		for(int i=5,j=1;j<=20;j++){
			System.out.println("5X"+j+"="+i*j);
			
			
		}
		int i=5,j=0;
		while (j<=20){
			j++;
			System.out.println("5X"+j+"="+i*j);
		}*/
		int i=0,j=1;
		for(int a=1;a<10;a++);{
			System.out.print(i+","+j);
			int k=i+j;
			j=k;
			i=j;
			System.out.print(","+i);
		}
		
		
		
	}
}