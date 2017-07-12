package collections.list;

import java.util.*;

public class MyComparator<T> implements Comparator<T>{

	public int compare(T obj1,T obj2){
		String s1 = obj1.toString();
		String s2 = (String) obj2;
		return s2.compareTo(s1);
		
	}
}
