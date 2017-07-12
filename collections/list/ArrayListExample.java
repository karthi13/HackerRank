package collections.list;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			al.add(i+3);
		}
		System.out.println(al);
		int j = al.size();//returns -> number of elements in the list.
		System.out.println(j);
	}

}
