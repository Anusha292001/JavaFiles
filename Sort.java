import java.io.*;
class Sort{
	public static void main(String[] anu)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("how many elements:");
		int n=Integer.parseInt(br.readLine());
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.println("enter Integer value:");
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("the elements BEFORE SORTING are:");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		
	}
	
	
		int limit=n-1;
		boolean flag=false;
		int temp;
		for(int i=0;i<limit;i++){
			for(int j=0;j<limit-i;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
					flag=true;
				}
				
			}
			if(flag=false)break;
			else flag=false;
			
		}
		System.out.println("the sorted elements are:");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
		
	}
}