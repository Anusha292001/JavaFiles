import java.util.*;
public class CharExchange {

	public static void main(String[] args) {
		String name="kp@!kum@r";
					 rm@!ukp@k
		 char[] c=name.toCharArray();
		
			
			
		
			for(int i=0,j=name.length()-1;i<j;) {
				 char m=name.charAt(i);
				 char k=name.charAt(j);
				if((Character.isAlphabetic(m)) && (Character.isAlphabetic(k))){
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
					i++;
					j--;
					
				}
				else if((Character.isAlphabetic(m)) && (!Character.isAlphabetic(k))){
					
					
					j--;
				}
				
				 else if((!Character.isAlphabetic(m)) && (Character.isAlphabetic(k))){
					
					 i++;
					
				 }
		
				
					
			}
		
		
				 System.out.println(c);
	}

		
		
}
		
			
			
		 
