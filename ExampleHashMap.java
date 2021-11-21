import java.util.HashMap;
public class ExampleHashMap{
	public static void main(String[] args){
		HashMap<Character,Integer> hashmap=new HashMap<Character,Integer>();
		hashmap.put('a',20);
		hashmap.put('b',20);
		hashmap.put('c',50);
		hashmap.put('f',35);
		hashmap.put('j',29);
		
		// hashmap.put("anusha");
		// hashmap.put("pooja");
		for(Character number:hashmap.keySet()){
			System.out.println(number+";"+hashmap.get(number));
			
		}
	}
	
}