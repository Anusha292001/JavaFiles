import java.io.*;
//import java.util.Arrays;
class SortArray{
	public int[] getSortNumbers(){
		int arr[]={10,6,9,55,43};
		int n=arr.length;
		
		System.out.println("the elements BEFORE SORTING are:");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	int temp=0;
	for(int i=0;i<n;i++){
		
		for(int j=i+1;j<n;j++){
			
			if(arr[i]<arr[j]){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;				
			}
			
		}
		
	}
		return arr;
	}
		public static void main(String[] anu1){
			SortArray manu=new SortArray();

			int[] anu=manu.getSortNumbers();
						System.out.println("....................");
			for(int i=0;i<anu.length;i++){
			System.out.println(anu[i]);
		}
		}
		
}
		


	
		
	
		
	
