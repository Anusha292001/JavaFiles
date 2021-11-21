public class ExceptionExample{
	public static void main(String[] args){
		int[] i=new int[4];
		String name=null;
		try{
		System.out.println(i[2]);
		System.out.println(name.length());
		}
		// }catch(java.lang.ArrayIndexOutOfBoundsException e){
			 // System.out.println("chatched");
		// }
		catch(Exception e){
			 throw new CustomException(e.getMessage());
			
		}
			
		// finally{
			// System.out.println("anotherrrrrrrr");
			
		// }
			
		
	}
}