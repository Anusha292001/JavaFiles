class Array{
	public int getNumbers(){
		int Arr[]={60,70,80,90};
		System.out.println("the array elements are:");
		for(int i=0;i<Arr.length;i++){
			System.out.println(Arr[i]);
		}
		return Arr.length;
	}
	public static void main(String[] anu){
		Array ramu=new Array();
		//int[] ramu=pavan.getNumbers();
		System.out.println(ramu.getNumbers());
		
	}
}