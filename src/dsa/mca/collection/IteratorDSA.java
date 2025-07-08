package dsa.mca.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDSA {

	public static void main(String[] args) {
		ArrayList<Integer> d=new ArrayList<Integer>();
		d.add(100);
		d.add(300);
		d.add(400);
		Iterator<Integer> l=d.iterator();
		while(l.hasNext())
		{
			Integer i=l.next();
			System.out.println(i);
			d.add(900);
		}
	}

}
