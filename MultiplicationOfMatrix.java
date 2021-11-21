import java.util.Scanner;
public class MultiplicationOfMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows and columns");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		int multiplication[][]=new int[r][c];
		
		System.out.println("enter elements for matrix A");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				a[i][j]=sc.nextInt();
			}
		}
		
			System.out.println("enter elements for matrix B");
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
					b[i][j]=sc.nextInt();
			}
		}
		System.out.println("the multiplication of a,b matrix is c:");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
					multiplication[i][j]=0;
					for(int k=0;k<c;k++){
					multiplication[i][j] = multiplication[i][j]+a[i][k]*b[k][j];
					}
			}
		}
		
		/* for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){						
				System.out.println(addition[i][j]);
			}
		} */
		
		for (int[] arr1D : multiplication) {
			for (int i : arr1D) {
				System.out.println(i);
		   }
		}
			
	}
}
						
			
		
				
			
			
		
			
		
		
		
		
		
		
	
