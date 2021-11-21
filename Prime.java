public class Prime{
	public static void main(String args[]){
		 int n=Integer.parseInt(args[0]); 
		 String name=args[1];
int count=0;		 
		
		
		/* int c=0,n=0,i=1,j=1;
		while(n<20){
			j=1;
			c=0;
			while(j<=i){
				if(i%j==0)
					c++;
				j++;
			}
			if(c==2){
			
				System.out.println(+i);
				n++;
			}
			i++;			
		} */
		
		/* int c=0,n=100,i=1,j=1;
		while(i<=n){
			j=1;
			c=0;
			while(j<=i){
				if(i%j==0)
					c++;
				j++;
			}
			if(c==2){
				System.out.println(+i);
			}
			i++;			
		} */
		int c=2,i=1,j=1;
		System.out.println("prime numbers from 3 to "+n+" are: " +name );
		while(i<=n){
			j=1;
			c=0;
			while(j<=i){
				if(i%j==0)
					c++;
				j++;
			}
			if(c==2){
			
				System.out.println(+i);
				count++;
			}
			
			i++;
				
		}
		System.out.println("\n \n total number of prime numbers between 3 and "+n+" are: "+count);

	}
}

