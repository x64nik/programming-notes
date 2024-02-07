import java.util.*;

class Students{
    int rollno;
    String name;

    Students(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
}


class DummyObjectComparator implements Comparator<Students>{
      // Overriding compare()method of Comparator 
       public int compare(Students s1, Students s2) {
            return 0;
       }
 }

public class Fix{
    public static void main(String[] args) {

        Students s1 = new Students(1, "s1");
        Students s2 = new Students(2, "s2");

        PriorityQueue<Students> q = new PriorityQueue<Students>(10, new DummyObjectComparator());
        //PriorityQueue<Students> q2 = new PriorityQueue<Students>();

        //PriorityQueue<Students> q = new PriorityQueue<Students>(Comparator.comparing(Node::getVal));
    
        q.add(s1);
        q.add(s2);

        System.out.println(q.peek().name + " " + q.peek().rollno);
        System.out.println(q.poll().name + " " + q.poll().rollno);

        // System.out.println(q.poll());
        // System.out.println(q.peek());

        // System.out.println(s1.rollno);
        System.out.println("\n\nworking");
    }
}