

import java.util.ArrayList;

public class ArrayListFunctions {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		ArrayList<String> p=new ArrayList<String>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(2, 25);
		a.add(50);
		//a.clear();
		System.out.println(a.clone());
		System.out.println(a.contains(10));
		System.out.println(a.containsAll(a));
		System.out.println(a.equals(10));
		System.out.println(a.hashCode());
		System.out.println(a.indexOf(3));
		System.out.println(a.isEmpty());
		System.out.println(a.remove(1));
		System.out.println(a.removeAll(a));
		a.add(28);
		a.add(29);
		a.add(1);
		a.add(26);
		p.add("Anusha");
		p.add("pavan");
		p.add("pooja");
		System.out.println(p.iterator());
		System.out.println(p.retainAll(p));
		System.out.println(p.toString());
		System.out.println(p.getClass());
		System.out.println(p.set(2, "manoj"));
	//	System.out.println(p.removeIf(2));
		System.out.println(p.listIterator());
		//System.out.println(p.notify());
		System.out.println(p.listIterator(3));
		System.out.println(p.parallelStream());
		System.out.println(p.stream());
		System.out.println(p.subList(0, 2));
		System.out.println(p.toArray());
		//System.out.println(p.toArray('k'));
		p.add(3,"bharathi");
		p.notify();
		p.notifyAll();
		p.toString();
		p.trimToSize();
		//p.wait(6);
		for(int i=0;i<a.size();i++) {
			System.out.println(a);
			
		}
		for(int j=0;j<p.size();j++) {
			System.out.println(p);
		}
		

	}

}
