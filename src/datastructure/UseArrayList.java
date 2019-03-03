package datastructure;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 */

		List<Integer> list = new ArrayList<Integer>();
		System.out.println("Original List");
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(600);
		list.add(700);

		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		list.remove(5);
		System.out.println(" ");
		System.out.println("Removed 600");
		System.out.println(" ");
		System.out.println("After removal");
		for (Integer data:list) {
			System.out.println(data);

		}


	}

}