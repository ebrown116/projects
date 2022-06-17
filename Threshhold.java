import java.util.Scanner;

public class Threshhold {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int MAX_SIZE = 20;
        int[] userValues = new int[MAX_SIZE];
        int i;
        int inputs = scnr.nextInt();

        for(i = 0; i <= inputs; i++) {
            userValues[i] = scnr.nextInt();
        }

        for(i = 0; i<inputs; i++) {
            if(userValues[i] <= userValues[inputs]) {
                System.out.print(userValues[i] + " ");
            }
        }
        System.out.println();
    }
}
