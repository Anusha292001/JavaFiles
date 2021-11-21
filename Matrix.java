import java.util.Scanner;
public class Matrix extends MatrixAddition{
	public static void main(String[] args) {
		Matrix addition=new Matrix();
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter the matrix row size");
		int row=sc.nextInt();
		System.out.println("Enter the matrix column size");
		int column=sc.nextInt();
		int A[][]=new int[row][column];
		int B[][]=new int[row][column];
		System.out.println("Enter the matrix A elements of size: "+row+" X "+column);
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				A[i][j]=sc.nextInt();
			}
		}		
		System.out.println("Enter the matrix B elements of size: "+row+" X "+column);
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				B[i][j]=sc.nextInt();
			}
		}
		int c[][]=addition.matrixAddition(A, B,row,column);
		System.out.println("Mattrix Addition is :");
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.println(c[i][j]);
			}
		}
	}
}