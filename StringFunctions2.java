
public class StringFunctions2 {

	public static void main(String[] args) {
		String str="Anusha example";
		String str2="Hello World";
		String name="Anusha example";
		String name2="";
		System.out.println(str.charAt(2));
		System.out.println(str.codePointAt(3));
		System.out.println(str.codePointBefore(2));
		//System.out.println(str.codePointCount(3, 2));
		System.out.println(str.compareTo("Hellowrold"));
		System.out.println(str.compareToIgnoreCase(str2));
		System.out.println(str.concat(str2));
		System.out.println(str.contains(name));
		System.out.println(str.contentEquals(str2));
		System.out.println(str.contentEquals(name));
		System.out.println(str.endsWith("example"));
		System.out.println(str.equals(name));
		System.out.println(str.equalsIgnoreCase("functions"));
		System.out.println(str2.hashCode());
		System.out.println(name.indexOf(5));
		System.out.println(str.indexOf(str2));
		System.out.println(str.indexOf(name));
		System.out.println(str.indexOf(str2,6));
		System.out.println(str2.intern());
		System.out.println(name2.isEmpty());
		System.out.println(str.lastIndexOf(1));
		System.out.println(str2.lastIndexOf(name));
		System.out.println(name.lastIndexOf(name, 3));
		System.out.println(str2.lastIndexOf(str2, 6));
		System.out.println(str.length());
		System.out.println(str.matches(name));
		System.out.println(str.offsetByCodePoints(5, 7));
		System.out.println(str.regionMatches(4,"Anusha",2,6));
		System.out.println(str.replace('a', 'm'));
		System.out.println(name.replace(name, name2));
		System.out.println(str.replaceAll("Anushm", "Anusha"));
		System.out.println(str2.replaceFirst(str2, "hi"));
		System.out.println(str.startsWith("A"));
		System.out.println(str.startsWith("s", 3));
		System.out.println(str.substring(2));
		System.out.println(str.substring(0,3));
		System.out.println(str2.toCharArray());
		System.out.println(str.toLowerCase());
		System.out.println(str2.toString());
		System.out.println(str.toUpperCase());
		System.out.println(str.trim());
		System.out.println(str.chars());
		System.out.println(name2.codePoints());
		System.out.println(name2.getBytes());
		System.out.println(str.getClass());
		System.out.println(str.split("u"));
		System.out.println(str.split("u", 5));
		System.out.println(str.subSequence(0, 3));
	//	System.out.println(str.copyValueOf());
		//System.out.println(str2.format(str2, args));
		System.out.println(str.join(name2, "anu"));
		System.out.println(name.valueOf('s'));
		System.out.println(str.CASE_INSENSITIVE_ORDER);
		 str.notify();
		str.notifyAll();
		// str.wait(0);
		

	}
}