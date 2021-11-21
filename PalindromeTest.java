import java.util.Scanner;
class PalindromeTest{
	public String getPalindromeValue(int NYMBER){
		
		int a,b=0;
		int n=NYMBER,givenNumber=NYMBER;
		while(n>0){
			a=n%10;//a=2 	//a=7
			b=b*10+a;//b=2	//27
			n=n/10;//n=7	//n=0
		}
		/* if(givenNumber==b){ 
			System.out.println(givenNumber+" is palindrome");
			return true;
		}else{
			System.out.println(givenNumber+" is not palindrome");
			return false;
		} */
		return givenNumber==b
				?givenNumber+" is palindrome"
				:givenNumber+" is not palindrome";
		
		}
		public static void main(String[] anu){
			PalindromeTest pavan=new PalindromeTest();
	
		/*System.out.println("the reverse number is:"+b);
		 if(givenNumber==b){ 
			System.out.println(givenNumber+" is palindrome");
		}else{
			System.out.println(givenNumber+" is not palindrome");
		}*/
		System.out.println(pavan.getPalindromeValue(17271));
		}
		
		

	}	