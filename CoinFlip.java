import java.util.Scanner;
import java.util.Random;

public class CoinFlip {
    public static String headsOrTails(Random rand) {
        int num = rand.nextInt(2);
        if (num / 1 == 1) {
            return "tails";
        } else {
            return "heads";
        }

    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random(2);
        int num = scnr.nextInt();
        int i;
        for(i = 0; i<num; i++) {
            System.out.println(headsOrTails(rand));
        }
    }
}
