public class Swaping{
	public static void main(String args[]){
		int a=3,b=9;
		
		System.out.println(" Before Swapping a="+a+", b="+b);
		//logic1
		 // int c=a;
		// a=b;
		// b=c; 
		
		//logic2
		a=a+b;//12
		b=a-b;// 12-9=3
		a=a-b;//12-3=9
		
		System.out.println(" After Swapping a="+a+", b="+b);
		
		int x=1,y=2,z=3;
		
		System.out.println(" Before Swapping x="+x+", y="+y+", z="+z);
		
		int m=x,n=y;
		x=z;
		y=m;
		z=n;		
		
		System.out.println(" After Swapping x="+x+", y="+y+", z="+z);
		
	}
}