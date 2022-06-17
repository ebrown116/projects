import java.util.Scanner;

public class MaxMin {
    public static int largestNumber(int num1, int num2, int num3){
        int max;
        if (num2 > num1 && num2 > num3) {
            max = num2;
        } else if (num1 > num2 && num1 > num3) {
            max = num1;
        } else {
            max = num3;
        }
        return max;
    }

    public static int smallestNumber(int num1, int num2, int num3){
        int min;
        if (num2 < num1 && num2 < num3) {
            min = num2;
        } else if (num1 < num2 && num1 < num3) {
            min = num1;
        } else {
            min = num3;
        }
        return min;
    }


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1 =scnr.nextInt();
        int num2 = scnr.nextInt();
        int num3 = scnr.nextInt();
        int max = largestNumber(num1, num2, num3);
        int min = smallestNumber(num1, num2, num3);
        System.out.println("largest: " + max);
        System.out.println("smallest: " + min);
    }
}
