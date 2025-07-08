package dsa.mca.collection;

import java.util.ArrayList;

public class DemoDSA {

	public static void main(String[] args)
	{
		ArrayList<Integer> n=new ArrayList<>();
		n.add(10);
		n.add(20);
		n.add(30);
		System.out.println(n);
		
		System.out.println(n.get(2));
		
		n.addFirst(78);
		System.out.println(n);
		
		n.add(2, 400);
		System.out.println(n);
		
	}

}
