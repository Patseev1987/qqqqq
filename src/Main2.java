import java.util.List;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        Hell hell = new Hell();
        hell.getInfo();
        System.out.println("*************************");
        List<Toy> aaaa = hell.getArrayList();
        for (Toy t: aaaa
             ) {
            System.out.println(t);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Hell.generate(new Random(),aaaa, hell.arrayFrequency));
        }
    }

}
