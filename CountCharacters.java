import java.util.Scanner;

public class CountCharacters {
    public static int countCharacters(char userChar, String userString) {
        int count = 0;
        int i;

        for(i=0; i<userString.length(); i++) {
            if(userString.charAt(i) == userChar) {
                count = count + 1;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char searchVal = input.next().charAt(0);
        String searchStr = input.nextLine();
        int charCount = countCharacters(searchVal, searchStr);
        System.out.println(charCount);

    }
}
