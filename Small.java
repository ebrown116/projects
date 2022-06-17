import java.util.Scanner;

public class Small {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int MAX_VAL = 20;
        int[] userValues = new int[MAX_VAL];
        int i;
        int smallest;
        int small;
        int max;
        int tot = scnr.nextInt();

        for(i=0; i< tot; i++) {
            userValues[i] = scnr.nextInt();
        }
        max = userValues[0];
        smallest = userValues[0];

        for(i=0; i<tot; i++){
            if(userValues[i] <smallest) {
                smallest = userValues[i];
            }
            if(userValues[i] > max){
                max = userValues[i];
            }
        }
        small = max;

        for(i=0; i<tot; i++){
            if(userValues[i] <=small && userValues[i] != smallest){
                small = userValues[i];
            }
        }
        System.out.println(smallest + " " +small);

    }
}
