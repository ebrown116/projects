import java.util.Scanner;

public class Threshold {
    public static void getUserValues(int[] myArr, int arrSize, Scanner scnr) {
        int i;

        for(i = 0; i < arrSize; i++) {
            myArr[i] = scnr.nextInt();
        }
    }

    public static void outputIntsLessThanOrEqualToThreshold(int[] userValues, int userValsSize, int upperThreshold){
        int i;
        for(i=0; i<userValsSize;i++) {
            if(userValues[i] <= upperThreshold) {
                System.out.print(userValues[i] + " ");
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[20];
        int upperThreshold;
        int numVals;

        numVals = scnr.nextInt();
        getUserValues(userValues, numVals, scnr);

        upperThreshold = scnr.nextInt();
        outputIntsLessThanOrEqualToThreshold(userValues, numVals, upperThreshold);
    }
}