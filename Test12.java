public class Test12{
	public  int getTotal(int x,int y){
			return x+y;
		}
		
	
	public float getTotal(float x, float y){
		return x*y;
	}
	public int getTotal(int x,int y,int z){
		return x+y+z;
	}
	public float getTotal(float x,float y,float z){
		return x*y*z;
	}
	public static void main(String []anu)throws Exception{
		Test12 test12=new Test12();
	//Test12 test12=(Test12)Class.forName("Test12").newInstance();
	System.out.println(test12.getTotal(2,3));
	System.out.println(test12.getTotal(4.7f,5.6f,3.2f));
	}
}	

