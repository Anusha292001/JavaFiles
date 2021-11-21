import java.io.*;
class Quadratic{
	public static void main(String args[])throws IOException{
		double x1,x2,a,b,d,disc;
		InputStreamReader obj=(new InputstreamReader(System.in));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a,b,c values");
		a=Double .parseDouble(br.readLine());
		b=Double .parseDouble(br.readLine());
		c=Double .parseDouble(br.readLine());
		disc =(b*b)-(4*a*c);
		if(disc==0){
			System.out.println("roots are real and equal");
			
		}else{
			System.out.println("roots are real and unequal");
			x1=(-b+math.sqrt(disc())/(2*a));
			x2=(-b+math.sqrt(disc())/(2*a));
			System.out.println("roots are "+x1+",+x2");
		}else{
			System.out.println("roots are imaginery");
		}
	}
}