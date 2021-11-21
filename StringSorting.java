import java.util.Arrays;
public class StringSorting{
	
	public static void main(String[] anu){
		String[] names={"pavan","anu","sha","kumar","priya"};
		System.out.println("names before sorting");
		for(String name:names){
			System.out.println(name);
		}
		System.out.println("names after sorting");
		
			Arrays.sort(names);
		
			for(String name:names){
				System.out.println(name);
			}
		
	}
}