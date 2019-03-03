package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queue = new LinkedList();
		System.out.println("__________________Original Queue__________________");
		queue.add("25");
		queue.add("50");
		queue.add("75");
		queue.add("100");

		Iterator itr = queue.iterator();


		System.out.println("LinkedList elements:");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		System.out.println("The Peek: " + queue.peek());
		queue.remove();
		System.out.println("Remove First Peek");
		System.out.println("New Peek: " + queue.peek());
		System.out.println(" ");

		System.out.println("_________________New Queue___________________");

		for (String data:queue) {
			System.out.println(data);

		}

		System.out.println("The Last Element: "+((LinkedList<String>) queue).getLast());
	}

}
