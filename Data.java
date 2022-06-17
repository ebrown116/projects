import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1 = scnr.nextInt();
        int i = 0;
        int store = 0;
        int max = num1;

        do {
            store = store + num1;
            num1 = scnr.nextInt();
            if(max < num1){
                max = num1;
            }

            i++;

        } while(num1>=0);
        store = store / i;
        System.out.println(store + " " + max);
    }
}
