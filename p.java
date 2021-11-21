import java.util.*;
public class p{
	
public static void main(String[] args){

		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		/* String str[]=new String[n];
		for(int i=0;i<n;i++){
			str[i]=sc.nextLine();
		for(int j=0;j<n;j++){
		System.out.println(str[i]);
		}
		}*/
		int temp;
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			
		}
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					if(arr[i]%10==arr[j]%10){
					if(arr[i]/10>arr[j]/10){
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
					}
					if(arr[i]%10>arr[j]%10){
					
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
					
					
					
				}	
				
			}
			for(int i=0;i<n;i++){
				System.out.println(arr[i]);
			}
		
}
}
	     
		
		
			
		
		