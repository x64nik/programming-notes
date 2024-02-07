// public class CollectionFwork {
// 	public static void main(String[] args){

// 	}
// }


// Java program to demonstrate the
// working of PriorityQueue
import java.util.*;

class Ele{
	int a;
	// String name;

	Ele(int a){
		this.a = a;
		// this.name = name;
	}
}

class Employee implements Comparable<Employee> {
 
    Long id;
    String name;
 
    Employee(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
     
    @Override
    int compareTo(Employee emp) {
        return this.getId().compareTo(emp.getId());
    }
 
    //Getters and setters
 
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }
}


class CollectionFwork {
	
	// Main Method
	public static void main(String args[])
	{

		// Employee obj1 = new Ele(1);
		// Ele obj2 = new Ele(2);
		// Ele obj3 = new Ele(3);

		// Comparator<Ele> customComparator = new Comparator<Ele>() {
  //          @Override
  //          public int compare(Ele obj1, Ele obj2) {
  //              return obj1.length() - obj2.length();
  //           }
  //       };

		// Creating empty priority queue

		Employee emp = new Employee(1l, "AAA");

		PriorityQueue<Employee> pQueue = new PriorityQueue<>();

		// Adding items to the pQueue using add()
		pQueue.add(emp);

		// Printing the top element of PriorityQueue
		System.out.println(pQueue);

		// Printing the top element and removing it
		// from the PriorityQueue container
	// 	System.out.println(pQueue.poll());

	// 	// Printing the top element again
	// 	System.out.println(pQueue.peek());
	}
}
