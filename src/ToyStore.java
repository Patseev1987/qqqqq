import java.util.PriorityQueue;
import java.util.Scanner;

public class ToyStore {
    Scanner sc = new Scanner(System.in);
    int id;
    private PriorityQueue<Toy> list = new PriorityQueue<>();

    private void put() {
        System.out.println("Entered name for toy:");
        String name = sc.next();
        System.out.println("Entered frequency:");
        int frequency = sc.nextInt();
        if (list.isEmpty()) {
            id = 1;
        } else {
            id = list.size() + 1;
        }
        list.add(new Toy(id, name, frequency));
    }

    public void putFew(int count) {
        if (count < 0) {
            System.out.println("Wrong count!");
            return;
        } else
            while (count > 0) {
                try {
                    put();
                } catch (RuntimeException e) {
                    System.out.println("You made a mistake!  " + e.getMessage());
                    continue;
                }
                count--;
            }
    }
    public String get (){
        list.peek();
      return   list.peek().toString();
    }
    public void getInfo(){
        System.out.println(list);
    }

}
