public class Primetwo {
	public static void main(String args[]) {
		int n = 3;
		while (n < 100) {
			int count=0,j = 2;
			while (j < n) {
					if (n % j == 0) {
						count++;
					} 
					j++;
			}
			if(count==0) {
				System.out.println(n);
			}
			n++;
		}

	}
}