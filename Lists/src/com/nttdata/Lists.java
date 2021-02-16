package com.nttdata;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Lists {
	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add("Akhil");
		Iterator itr=arrayList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println(arrayList.indexOf(2));
		System.out.println(arrayList.size());
		LinkedList linkedList =new LinkedList();
		linkedList.add(50);
		System.out.println(linkedList.hashCode());
		linkedList.add("Akhil");
		linkedList.add(50);
		linkedList.add(30.5);
		Iterator itr1=linkedList.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
			
		}
		
	}


}
