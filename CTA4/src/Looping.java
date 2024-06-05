import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double[] values = new double[5];
        int count = 0;

        
        while (count < 5) {
            System.out.print("Enter floating-point value " + (count + 1) + ": ");
            if (scanner.hasNextDouble()) {
                values[count] = scanner.nextDouble();
                count++;
            } else {
                System.out.println("Invalid input. Please enter a valid floating-point number.");
                scanner.next(); 
            }
        }

        
        double total = 0;
        double maximum = values[0];
        double minimum = values[0];

        for (int i = 0; i < values.length; i++) {
            total += values[i];
            if (values[i] > maximum) {
                maximum = values[i];
            }
            if (values[i] < minimum) {
                minimum = values[i];
            }
        }

        double average = total / values.length;
        double interest = total * 0.20;

        System.out.println("\nResults:");
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
        System.out.println("Interest on total at 20%: " + interest);

        scanner.close();
    }
}