import com.sun.security.jgss.GSSUtil;

import java.util.PriorityQueue;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
Toy t1 = new Toy(1, "Asd",5);
        Toy t2 = new Toy(2, "DDDD",1);
        Toy t3 = new Toy(3, "Fg",9);
        Toy t4 = new Toy(4, "Vbg",5);
        Toy t5 = new Toy(5, "Rty",1);
        Toy t6 = new Toy(6, "Asd",2);
        Toy t7 = new Toy(7, "f444",9);

        PriorityQueue <Toy> q1  = new PriorityQueue<>(((o1, o2) -> o2.getFrequency()- o1.getFrequency()));

q1.add(t1);
        q1.add(t2);
        q1.add(t3);
        q1.add(t4);
        q1.add(t5);
        q1.add(t6);
        q1.add(t7);
        PriorityQueue<Toy> q2 = new PriorityQueue<>(((o1, o2) -> o1.getFrequency()- o2.getFrequency()));
        q2.add(t1);
        q2.add(t2);
        q2.add(t3);
        q2.add(t4);
        q2.add(t5);
        q2.add(t6);
        q2.add(t7);
        System.out.println(q1);
        System.out.println("-----------------------------");
        System.out.println(q2);
    }
}