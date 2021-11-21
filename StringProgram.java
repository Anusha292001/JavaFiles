public class StringProgram{
	public String getString(String name){
	return name;
	}
	
	//public static void main(String ANU[]){
		//StringProgram anu=new StringProgram();
		//String name=ANU[0];
		public int getStringLength(String string){
		//System.out.println("The length of "+name+" is "+name.length());
		return string.length();
		}
	
		//System.out.println(anu.name1);
		public static void main(String ANU[]){
			StringProgram anu=new StringProgram();
			System.out.println(anu.getStringLength("Anushka"));
			System.out.println(anu.getString("pavankumar.k"));
		}
		
	
	
}
