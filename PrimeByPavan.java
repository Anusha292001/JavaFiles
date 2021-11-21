public class PrimeByPavan{
	static public void main(String[] pavan){
		
		int n=Integer.parseInt(pavan[0]);
		String name=pavan[1];
		boolean isPrime=false;
		int count=2;
		/* for(int i=2;i<n;i++){
			if(n%i==0){
				System.out.println(i+"....");
				isPrime=false;
				break;
			}else{
				isPrime=true;
			}
		}
		
		if(isPrime){
				System.out.println(n+" is a prime number:"+ name);
			}else{
				System.out.println(n+" is not a prime number:"+ name);
			} */
			System.out.print("Prime numbers from 2 to "+n+" are: " +name+" 2 ,3" );
			for(int i=4;i<n;i++){
				
				for(int j=2;j<i;j++){
					if(i%j==0){
						isPrime=false;
						break;
					}else{
						isPrime=true;
					}
				}
				
				if(isPrime){
					System.out.print(", "+i);
					count++;
				}
			}
		System.out.println("\n \n Total number of prime numbers between 2 and "+n+" are: "+count);
		
	}
}