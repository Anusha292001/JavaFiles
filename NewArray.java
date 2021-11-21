public class NewArray{
	int ages[]=new int[] {20,21,22,23};
	public static void main(String [] args){
		NewArray array=new NewArray();
		System.out.println(array.ages[0]);

		StaticRelated[] stat=new StaticRelated[5];

		StaticRelated s1=new StaticRelated();
		s1.id=1;
	    s1.name="anu";
		
		StaticRelated s2=new StaticRelated();
		s2.id=2;
		s2.name="manoj";
		
		
		stat[0]=s1;
		stat[1]=s2;
		
		 System.out.println(stat[0].id);
		 System.out.println(stat[1].name);
		 System.out.println(stat[0].id);
		 System.out.println(stat[1].name);
		// System.out.println(stat.length);
		
		
	}
	
}
