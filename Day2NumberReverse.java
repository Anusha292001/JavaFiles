import java.util.Scanner;
public class Day2NumberReverse{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("how many numbers u have to print;");
		 int n=sc.nextInt();
		int[] arr=new int[n];
		int[] reverse=new int[n];
		System.out.println("enter ur own number;");
		int temp;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			
		}
			for(int i=0;i<arr.length;i++){ 
				while(arr[i]>0){//34
					temp=arr[i]%10;//4
					reverse[i]=reverse[i]*10+temp;//4
					arr[i]=arr[i]/10;//3
				}
				System.out.print(reverse[i]+" ");
			}
			
		
	
	}
	
	
}