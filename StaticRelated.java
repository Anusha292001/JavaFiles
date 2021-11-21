public class StaticRelated{
	 public StaticRelated(int id, String name){
		 id=id;
		 name=name;
		
	 }
	// static void getname(String name){
		// name="anusha";
		// System.out.println(name);
		
		
	// }
	public static void main(String []args){
		
	
	int ar[]=new int[] {1,2,10,5,12,13};

	System.out.println(ar[2]);
	System.out.println(ar.length);
	for(int i=1;i<=ar.length;i++){
		if (ar[i]!=null){
			System.out.println("out");
		}
		System.out.println(ar[1]);
		
	}
	}
	
}