package com.sk.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		LL list = new LL();

		list.insertFirst(11);
		list.insertFirst(12);
		list.insertFirst(13);
		list.insertLast(14);
		list.insertLast(15);
		list.insert(100, 3);
		 System.out.println(list.deleteLast());
		list.display();
		
		// System.out.println(list.deleteFirst());

	}
}
