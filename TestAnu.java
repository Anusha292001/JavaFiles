import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Array{
		int arr[][];
		int r,c;
		Array(int r, int c){
			this.r=r;
			this.c=c;
			arr=new int[r][c];
		}
		int[][] getMatrix() throws NumberFormatException, IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
					System.out.println("enter the elements");
					arr[i][j]=Integer.parseInt(br.readLine());
				}
			}
			return arr;
		}

		int[][] findSum(int a[][],int b[][]){
			int temp[][]=new int[r][c];
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
					temp[i][j]=a[i][j]+b[i][j];
				}
			}
			return temp;
		}
		void putMatrix(int[][] temp){
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
					System.out.println(temp[i][j]);
				}
			}
			
		}
}
class TestAnu{
	public static void main(String[] args)throws IOException{
		Array obj1=new Array(3,3);
		Array obj2=new Array(3,3);
		int x[][],y[][],z[][];
		System.out.println("enter matrix x:");
		x=obj1.getMatrix();
		System.out.println("enter matrix y:");
		y=obj2.getMatrix();
		z=obj1.findSum(x, y);
		System.out.println("the addition of two matrix is:");
		obj1.putMatrix(z);
	}
}