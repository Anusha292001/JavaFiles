class Test11{
	public int[] getArray(int n){
		int[] anu=new int[n];
		for(int i=0;i<n;i++){
			
			anu[i]=i+1;
		}
		return anu;
	}
	
	static{
		System.out.println("Haloo Anuuuuuuuuuuuu");
	}
	
	public static void main(String[] harathi){
		Test11 harathi1=new Test11();
		//System.out.println(harathi1.getArray(10));
		int a[]=harathi1.getArray(10);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		harathi1.printArrayElements(harathi1.getArray(11));
		
	}
	
	public void printArrayElements(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		printPavan();
	}
	
	
	public void printPavan(){
		System.out.println("Halooooooooooo  Pa1");
	}
}