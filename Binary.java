import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int x = scnr.nextInt();
        do{
            System.out.print(x % 2);
            x = x /2;
        }while(x>0);
        System.out.println("");
    }
}
