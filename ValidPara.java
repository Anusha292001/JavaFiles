import java.util.Arrays;
public class ValidPara{
    public static void main(String args[]){
	String str=")()(";
        char[] chars=str.toCharArray();
        int count=0;
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='('){
                count++;
			}
			else if(chars[i]==')'){
                count--;
			}
        }
        if(count==0){
            System.out.println("The parentheses are balanced!");
		}else{
			System.out.println("not balanced");
		}
		
    }
}