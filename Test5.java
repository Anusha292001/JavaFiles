import java.util.*;
class Test5{
	public int getBiggestNumber(){
		int[] a={211,5,9,11,99,6,87,0,500,999};
		/* for(int i=0;i<a.length;i++){ 
			
		System.out.println(a[i]);
		}*/
		/* Arrays.sort(a);
		
		System.out.println(a[a.length-1]);
		
		System.out.println(a[0]); */
		int temp=0;
		
		for(int i=1;i<=a.length-1;i++){
			if(a[0]<a[i]){
				temp=a[0];
				a[0]=a[i];
				a[i]=temp;
			}
		}
			return a[0];
		
	}
		public static void main(String[] anu){
			Test5 pavan=new Test5();
		
		System.out.println(pavan.getBiggestNumber());
		}
	}