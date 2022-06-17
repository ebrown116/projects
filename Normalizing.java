import java.util.Scanner;

public class Normalizing {
    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scnr = new Scanner(System.in);

        final int MAX_VAL = 20;
        int[] userValues = new int[MAX_VAL];
        int i;
        int tot = scnr.nextInt();
        int min;

        for(i = 0; i < tot; i++) {
            userValues[i] = scnr.nextInt();
        }

        min = userValues[0];

        for(i = 0; i < tot - 1; i++) {
            if (userValues[i+1] < min) {
                min = userValues[i + 1];
            }
        }
        for(i = 0; i < tot; i++) {
            System.out.print((userValues[i] - min) + " ");
        }
        System.out.println();
    }
}
