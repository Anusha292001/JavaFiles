import java.util.*;
public class Demo{
	public static void main(String[] args){
		Vector v=new Vector();
		Enumeration e=v.elements();
		Iterator itr=v.iterator();
		ListIterator it=v.listIterator();
		System.out.println(e.getClass());
		System.out.println(itr.getClass());
		System.out.println(it.getClass());
		
	}
}