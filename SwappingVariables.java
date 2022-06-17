import java.util.Scanner;

public class SwappingVariables {
    public static void swapValues(int[] values) {
        int temp = values[0];
        values[0] = values[1];
        values[1] = temp;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] values = new int[2];
        values[0] = scnr.nextInt();
        values[1] = scnr.nextInt();
        swapValues(values);
        System.out.println(values[0] + " " + values[1]);
    }
}
