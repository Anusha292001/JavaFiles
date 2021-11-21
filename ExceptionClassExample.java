// import java.io.ArrayIndexOutOfBoundsException;
// import java.io.NullPointerException;

public class ExceptionClassExample{
	public static void getExcep(){
		int[] a=new int[5];
		String name=null;
		int i=0;
			System.out.println(name.length());
		try{
		System.out.println(a[10]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("exception catched");
		}
		System.out.println(i);
	}
	public static void main(String[] args) throws NullPointerException{
		// ExceptionClassExample ex=new ExceptionClassExample();
		getExcep();
	}
}