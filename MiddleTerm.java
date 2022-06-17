import java.util.Scanner;

public class MiddleTerm {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        final int MAX_VAL = 9;
        int[] userValues = new int[MAX_VAL];
        int i = 0;
        int userNum = scnr.nextInt();

        while((userNum >= 0)&&(i < MAX_VAL)) {
            userValues[i] = userNum;
            i++;
            userNum = scnr.nextInt();
        }

        if(i % 2 == 0 ) {
            System.out.println("Must be an odd number of integers");
        }
        else if(userNum >= 0) {
            System.out.println("Too many inputs");
        } else {
            System.out.println(userValues[i/2]);
        }
    }
}
