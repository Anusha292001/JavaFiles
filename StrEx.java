 // import java.util.ArrayList;
 // import java.util.Scanner;
 public class StrEx extends Ex{
	 public int a;
	 public String b;
	 public StrEx(){}
	 public StrEx(int c,int e,String d ){
		 // this.c=a;
		 // this.d=b;
		 super(c,e,d);
	 }
	 public void getI(){
		System.out.println(super.getId());
		 
	 }
	public static void main(String[] args){
		
		StrEx s=new StrEx(10,20,"anu");
		s.getI();
		
		
		
		
	}
}