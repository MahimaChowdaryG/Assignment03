package question14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Synchronizing on the ArrayList instance:
		//You can synchronize the entire ArrayList instance by using the synchronized keyword, 
		//which will ensure that only one thread can access the ArrayList at a time.
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		synchronized(list) {
		   list.add("Hello");
		   list.add("World");
		}
		
		//Using the CopyOnWriteArrayList class:
		//You can use the CopyOnWriteArrayList class instead of ArrayList, 
		//which provides thread-safe access to the list without the need for explicit synchronization.
		List<String> list2 = new CopyOnWriteArrayList<String>();
		list.add("Hello");
		list.add("World");


	}
	
	//Using synchronized methods:
	//You can also create synchronized methods for adding, removing,
	//and iterating over the elements of the ArrayList.
	public synchronized boolean add(E e) {
	    return super.add(e);
	}


}
