package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> BobInfo = new ArrayList<String>();
		BobInfo.add("Gender: Male");
		BobInfo.add("DOB: 03/02/1997");
		BobInfo.add("State: NY");

		List<String> Mary = new ArrayList<String>();
		Mary.add("Gender: Female");
		Mary.add("DOB: 02/09/1990");
		Mary.add("State: Alabama");

		Map<String, List<String>> map = new HashMap<String, List<String>>();
		map.put("Bob", BobInfo);
		map.put("Mary", Mary);

		for (Map.Entry<String, List<String>> country:map.entrySet()){
			System.out.println(country.getKey() + " " + country.getValue());
		}
	}
}

