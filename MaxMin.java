import java.util.Arrays;

public class MaxMin{
	public static void main(String[] args){
		  int[] arr={2,5,1,3,9};
		
		Arrays.sort(arr);
		System.out.println("min value is:"+arr[0]);
		System.out.println("max value is:"+arr[arr.length-1]);
		

		
	}
}