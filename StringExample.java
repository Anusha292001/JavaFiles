public class StringExample{
	public  static void main(String[] args){
		String name="Pavan";
		String name1="Pavan";
		
		String name4="pavAN";
		
		String name2=new String("Pavan");
		String name3=new String("Pavan");
		String name5="";
		
		int i=10,x=10;
		
		
		System.out.println(name==name1);
		System.out.println(name.equals(name1));
		System.out.println(name.hashCode());
		System.out.println(name1.hashCode()); 
		name=name+"pavan";
		System.out.println(name.hashCode());
		
		System.out.println(name2==name3);
		System.out.println(name2.equals(name3));
		/* System.out.println(name2.hashCode());
		System.out.println(name3.hashCode()); */
		System.out.println(".......................");
		System.out.println("charAt()"+name.charAt(2));
		System.out.println("equals()"+name.equals(name4));
		System.out.println("equalsIgnoreCase()"+"paVan".equalsIgnoreCase("PaVaN"));
		System.out.println("contains()"+name.contains("van"));
		System.out.println("startsWith()"+name.startsWith("Pa"));
		System.out.println("endsWith()"+name.endsWith("van"));
		System.out.println("startsWith()"+name.startsWith("van"));
		System.out.println("endsWith()"+name.endsWith("Pa"));
		System.out.println("isEmpty()"+name.isEmpty());
		System.out.println("isEmpty()"+name5.isEmpty());
		
	}
}