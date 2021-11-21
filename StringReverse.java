import java.util.*;
class StringReverse{
	public String getReverseValue(String name){
			String reverse="";
		for(int i=name.length()-1;i>=0;i--){
			//System.out.print(name.charAt(i));
			
			reverse=reverse+name.charAt(i);
		}
		System.out.print(reverse);
		return reverse;
	}
	
	public static void main(String[] anu){
		StringReverse manu=new StringReverse();
		System.out.println(manu.getReverseValue("kpavankumar"));
		//System.out.println(name.charAt(5));
	}
}