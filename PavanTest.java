class PavanTest{
	public PavanTest(){
		System.out.println("haloo pavan i'm from constructor");
	}
	
	static{
		System.out.println("haloo pavanuuuuuuuuuuuuu I'm from ststic block");
	}
	public static void main(String[] asd){
		//System.out.println("haloo pavan I'm from main method");
		//PavanTest p=new PavanTest();
		
		int arr[]={1,5,9,23,6,987};
		
		//for loop
		for(int i=0;i<arr.length;i++){
			System.out.println("for loop.........");
			
			System.out.println(arr[i]);
		}
		
		//enchanced for loop
		for(int k: arr){
			System.out.println("enhanced for loop ...........");
			System.out.println(k);
		}
	}
}