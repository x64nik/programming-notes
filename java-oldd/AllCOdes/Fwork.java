import java.util.ArrayList;
import java.util.Iterator;



public class Fwork{
	public static void main(String[] args){

		ArrayList<Integer> arr1 = new ArrayList();
		arr1.add(10);
		arr1.add(20);
		arr1.add(30);

		System.out.println(arr1);

		for (int ele: arr1){
			System.out.println(ele);
		}

		Iterator it = arr1.iterator();

		// System.out.println(it.next());
		// System.out.println(it.next());
		// System.out.println(it.next());
		while(it.hasNext())

		System.out.println(it.next());


		System.out.println("\n\nend...");
	}
}