import java.io.*;
import java.util.Scanner;
class TransposeTest{
	public int getTranspose(){
	
	int r[]=new int[5];
	
	System.out.println(r.length);
	
	System.out.println(r[0]+" "+r[1]+" "+r[2]+" "+r[3]+" "+r[4]);
	
	for(int i=0;i<r.length;i++){
		r[i]=i;
		System.out.println(r[i]);
	}
		return r.length;
	}
	
	/* Scanner sc= new Scanner(System.in);
	System.out.println("enter roll number1 and name");
	int r0=sc.nextInt();
	String n0=sc.nextLine();
	System.out.println("enter rol2 number2 and name");
	int r1=sc.nextInt();
	String n1=sc.nextLine();
	System.out.println("enter roll number3 and name");
	int r3=sc.nextInt();
	String n3=sc.nextLine();
	System.out.println("enter roll number4 and name");
	int r4=sc.nextInt();
	String n4=sc.nextLine();
	System.out.println("enter roll number5 and name");
	int r2=sc.nextInt();
	String n2=sc.nextLine();
	
	System.out.println("All roll numbers and names are :");
	
	System.out.println(roll1 +" "+name1);
	System.out.println(roll2 +" "+n2);
	System.out.println(r3 +" "+n3);
	System.out.println(r4 +" "+n4);
	System.out.println(r5 +" "+n5); */
	public static void main(String args[]){
		TransposeTest anu=new TransposeTest();
		System.out.println(anu.getTranspose());
	}
	
}