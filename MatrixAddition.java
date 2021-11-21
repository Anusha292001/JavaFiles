import java.util.Scanner;

public class MatrixAddition{
	public int[][] matrixAddition(int[][] A,int[][] B,int row,int column){
		int[][] C=new int[row][column];
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
			C[i][j]=A[i][j]+B[i][j];	
			}
		}
		
		return C;
	}
}