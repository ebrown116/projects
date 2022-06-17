import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int x = scnr.nextInt();
        int y = x / 10;
        int z = x % 10;
        if ((x<20)||(x>98)) {
            System.out.println("Input must be 20-98");
        } else {
            while(!(y==z)) {
                System.out.print(x + " ");
                x = x - 1;
                y = x / 10;
                z = x % 10;
            }
            System.out.println(x + " ");
        }
    }
}
