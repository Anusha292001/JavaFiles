import java.util.*;
public class ValidPara2 {
    public static void main(String args[]) {
        String str ="())";
        char[] chars = str.toCharArray();
        int counter = 0;
        for (int n = 0; n < chars.length; n++) {
            if (chars[n] == '(')
                counter++;
            else if (chars[n] == ')')
                counter--;
        }
        if (counter == 0)
            System.out.println("The parentheses are balenced!");
        else if(counter < 0)
            System.out.println("There are to many closed parenthesis!");
        else if(counter > 0)
            System.out.println("There are to many opened parenthesis!");
    }
}