public class  SetterGetter{
	//private int i;
	private String name;
	// public void setId(int a){
		// i=a;
		
	// }
	// public int getId(){
		// return i;
	// }
	public void setName(String n){
		name=n;
	}
	public String getName(){
		
		return name;
	}
	public static void main(String[] args){
		SetterGetter st=new SetterGetter();
		st.setName(args[0]);
		// System.out.println(st.getId());
		System.out.println(st.getName());
		for(int i=1;i<args.length;i++){
			System.out.println(args[i]);
			
		}
	}
}