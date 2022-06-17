import java.util.Scanner;

public class MadLibs{
        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            String word;
            int num;
            word = scnr.next();
            num = scnr.nextInt();
            while(!(word.equals("quit"))){
                System.out.println("Eating " + num + " " + word + " a day keeps the doctor away.");
                word = scnr.next();
                num = scnr.nextInt();
            }
        }
}
