import java.util.Arrays;
import java.util.Random;
public class Cccc {

        public static int generate(Random random, int[] numbers, int[] chances) {
            int x = random.nextInt(chances[chances.length-1]);
            int i = Arrays.binarySearch(chances, x);
            if (i < 0) i = -1 - i;
            return numbers[i];
        }

        public static void main(String[] args) {
            Random random = new Random();
            int[] numbers = new int[] {1,  2, 3  };
            int[] chances = new int[] {20, 20, 60};

            for (int q=1; q<chances.length; ++q) {
                chances[q] += chances[q-1];
            }

            for (int q=0; q<10; ++q) {
                System.out.println(generate(random, numbers, chances));
            }
        }
    }

