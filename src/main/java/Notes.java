import java.util.HashMap;
import java.util.ArrayList;

class Notes {
	public static void main(String[] args) {

		//AutoBoxing and Unboxing (Using Wrapper Classes)

		//change our primitive data types into non-primitive data types

		// Integer;
		// Boolean;
		// Character;
		// Double;

		//Creating ArrayLists (Uses Wrapper Classes not Primitive types)

		ArrayList<Integer> arrL = new ArrayList<Integer>(); //create an empty arraylist

		//Use methods to access ArrayLists, do not use Array notation


		//add(value)
		arrL.add(3); //adds the value to the end of the arrayList

		//get(index) - get you the value from the provided index
		int num = arrL.get(0); //unbox for you into an int
		System.out.println(num);
		//clear() - remove all elements from the arrayList
		arrL.clear();
		// System.out.println(arrL.get(0));  //Index out of bounds since there is nothing in the arrayList

		//size() - length does not exist as a way to get the length of the arraylist.  Instead we use .size() for arrayList

		System.out.println(arrL.size());
		
		//set(index, value) - replaces the value the given index

		arrL.add(3);
		arrL.add(2);
		arrL.set(0, 4);
		System.out.println(arrL); //ArrayList can simply just be printed
		// int[] arr = new int[]{1, 3 , 5};
		// System.out.println(arr);

		//remove

		int a = 0; //index
		Integer b = 2; //value
		
		arrL.remove(b);
		System.out.println(arrL);

		//Createing a HashMap

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		//creates an empty HashMap

		//first data type -> Key
		//second data type -> Value (definition)

		//Keys have to be unique
		//Values do not have to unique
		
		//Adding to a HashMap

		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 1);
		// map.put("a", 5); //KEYS NEED TO BE UNIQUE
		
		//Getting a Value from a HashMap -> access by key

		System.out.println(map.get("c"));

		//remove a key and value from a hashmap -> remove on the key

		map.remove("d");
		
		//clearing a hashmap

		// map.clear();

		//size

		System.out.println(map.size());

		//print a hashmap

		System.out.println(map);

		//using hashmap vs parallel arrays/arraylists

		//HashMap -> When we have 2 groups data.  And we don't care about order, HashMaps are faster
		//Parallel Array/Arraylists -> More than 2 groups of data, When Order Matters
		
	}
}
