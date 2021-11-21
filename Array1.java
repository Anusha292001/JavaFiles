import java.util.SCanner;
class Array1{
	public  int getAverage(){
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many subjects");
		//int n=Integer.parseInt(br.readLine());
		//int marks[]=new int[n];
		int n=sc.nextInt();
		for(int i=0;i<marks.length;i++){
			System.out.println("enter the marks");
			marks[i]= Integer.parseInt();
			}
			int total=0;
			for(int i=0;i<marks.length;i++){
				total=total+marks[i];
			}
			System.out.println("the total marks is:"+total);
			float average=(float)total/n;
			System.out.println("the average marks:" +average);
			return n;
	}
	public static void main(String[] ramu){
		Array1 anu=new Array1();
		System.out.println(anu.getAverage());
		
	}
}

