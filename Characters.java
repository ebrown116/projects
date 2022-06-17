import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String full = scnr.next();
        char letter = full.charAt(0);
        String word = scnr.nextLine();
        int length = (word.length()) - 2;
        int i;
        int tot = 0;

        for (i = 0; i <= length; i++){
            if((word.charAt(i))==(letter)) {
                tot = tot + 1;
            }
        }
        System.out.println(tot);

    }
}
