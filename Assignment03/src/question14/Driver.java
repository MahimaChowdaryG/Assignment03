    package question14;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
public class Driver {
public static void main(String[] args) {
// TODO Auto-generated method stub
//Synchronizing on the ArrayList instance:
//We can synchronize the entire ArrayList instance by using the synchronized keyword, 
//this will ensure that only one thread can access the ArrayList at a time.
List<String> list = Collections.synchronizedList(new ArrayList<String>());
synchronized(list) {
list.add("Hello");
list.add("World");
}
//Using the CopyOnWriteArrayList class:
//You can use the CopyOnWriteArrayList class instead of ArrayList, this provides threadsafe access to the list and we do’t need explicit synchronization
List<String> list2 = new CopyOnWriteArrayList<String>();
list.add("Hello");
list.add("World");
}
//Using synchronized methods:
//We can also create synchronized methods
public synchronized int add() {
	return 0;
}
}
