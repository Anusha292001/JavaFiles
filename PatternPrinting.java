import java.util.*;
public class PatternPrinting {
    public static void main(String[] args)
    {
		//CountNumberOfCharacters c=new CountNumberOfCharacters();
		CountNumberOfCharacters.xYz(args[0]);
		
          
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      for(int i=1;i<=num;i++)
      {
          for(int j=1;j<=i;j++)
          {
              System.out.print(j);
          }
          System.out.println();
      }


    }
}