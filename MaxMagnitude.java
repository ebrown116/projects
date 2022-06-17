import java.util.Scanner;

public class MaxMagnitude {
    public static int maxMagnitude(int userVal1, int userVal2){
        int max = 0;
        if(userVal1 < 0 && userVal2 < 0) {
            userVal1 = userVal1 * -1;
            userVal2 = userVal2 * -1;
            if(userVal1 > userVal2) {
                max = userVal1 * -1;
                userVal1 = userVal1 * -1;
                userVal2 = userVal2 * -1;
            } else {
                max = userVal2 * -1;
                userVal1 = userVal1 * -1;
                userVal2 = userVal2 * -1;
            }
        }
        if(userVal1 > 0 && userVal2 < 0) {
            userVal2 = userVal2 * -1;
            if(userVal1 > userVal2) {
                max = userVal1;
                userVal2 = userVal2 * -1;
            } else {
                max = userVal2 * -1;
                userVal2 = userVal2 * -1;
            }
        }
        if(userVal2 > 0 && userVal1 < 0) {
            userVal1 = userVal1 * -1;
            if(userVal1 > userVal2) {
                max = userVal1 * -1;
                userVal1 = userVal1 * -1;
            } else {
                max = userVal2;
                userVal1 = userVal1 * -1;
            }
        }
        if(userVal1 > 0 && userVal2 > 0) {
            if (userVal1 > userVal2) {
                max = userVal1;
            } else {
                max = userVal2;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int uVal1 = scnr.nextInt();
        int uVal2 = scnr.nextInt();
        int max = maxMagnitude(uVal1, uVal2);
        System.out.println(max);

    }
}
