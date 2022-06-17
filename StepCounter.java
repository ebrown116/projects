import java.util.Scanner;

public class StepCounter {

    public static double stepsToMiles(int userSteps) {
        double walk = userSteps / 2000.0;
        return walk;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int steps = scnr.nextInt();
        double miles = stepsToMiles(steps);
        System.out.printf("%.2f", miles);/* Type your code here. */
    }
}