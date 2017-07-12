package collections.list;

import java.util.TreeSet;

public class Treeset<T> implements Comparable<T>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Object> t = new TreeSet();
		t.add("Raja");
		t.add("Ashay");
		t.add("Karthi");
		t.add("Gary");
		t.add("Mictell");

		System.out.println(t);
	}

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
