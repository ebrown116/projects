import java.util.Scanner;

public class EvenOdd {
    public static boolean isArrayEven(int[] arrayValues, int arraySize){
        int i;

        for (i=0; i<arraySize; i++){
            if(arrayValues[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isArrayOdd(int[] arrayValues, int arraySize){
        int i;

        for (i=0; i<arraySize; i++){
            if((arrayValues[i] - 1) % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] num = new int[20];
        int size = scnr.nextInt();
        int i;

        for(i=0; i < size; i++) {
            num[i] = scnr.nextInt();
        }
        if(isArrayEven(num, size)){
            System.out.println("all even");
        } else if(isArrayOdd(num, size)) {
            System.out.println("all odd");
        } else {
            System.out.println("not even or odd");
        }
    }
}
