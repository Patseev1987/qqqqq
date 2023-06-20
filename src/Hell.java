import java.util.*;


public class Hell {

    private int id;
    private int[] arrayId = {1, 2, 3, 4, 5, 6, 7};
     int[] arrayFrequency = {2, 5, 2, 9, 5, 1, 7};
    private String[] names = {"Car", "Knight", "Superman", "Bear", "Plane", "Rocket", "Phone"};
    private Queue<Toy> list = new PriorityQueue<>(((o1, o2) -> o1.getId() - o2.getId()));
    private List<Toy> arrayList = new ArrayList<>();

    public Hell() {
        for (int i = arrayId.length - 1; i >= 0; i--) {
            list.offer(new Toy(arrayId[i], names[i], arrayFrequency[i]));
        }
    }

    public void getInfo() {
        for (Toy toy : list) {
            System.out.println(toy);
        }
    }
    public List<Toy> getArrayList() {

        while (!list.isEmpty()) {
           arrayList.add(list.poll());
        }
        return arrayList;
    }

    public static Toy generate(Random random, List<Toy> list, int[] chances) {
        int x = random.nextInt(chances[chances.length-1]);
        int i = Arrays.binarySearch(chances, x);
        if (i < 0) i = -1 - i;
        return list.get(i);
    }
}

