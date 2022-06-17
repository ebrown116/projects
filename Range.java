import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int MAX_VAL = 20;
        int[] userValues = new int[MAX_VAL];
        int tot = scnr.nextInt();
        int low;
        int high;
        int i;

        for(i=0; i<tot; i++){
            userValues[i] = scnr.nextInt();
        }

        low = scnr.nextInt();
        high = scnr.nextInt();

        for(i=0; i<tot; i++){
            if(userValues[i] >= low && userValues[i] <= high) {
                System.out.print(userValues[i] + " ");
            }
        }
        System.out.println();
    }
}
