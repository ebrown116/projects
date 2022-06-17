import java.util.Scanner;

public class NumInReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUM_VALS = 20;
        int[] userList = new int[NUM_VALS];
        int numInputs;
        int i;
        numInputs = input.nextInt();

        for(i = 0; i < numInputs; i++) {
            userList[i] = input.nextInt();
        }

        for(i = numInputs - 1; i >= 0; i--) {
            System.out.print(userList[i] + " ");
        }
        System.out.println();
    }
}
