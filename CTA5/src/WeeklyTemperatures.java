import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperatures {
    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        
        for (String day : weekDays) {
            System.out.print("Enter the average temperature for " + day + ": ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // Consume the invalid input
                System.out.print("Enter the average temperature for " + day + ": ");
            }
            double temp = scanner.nextDouble();
            days.add(day);
            temperatures.add(temp);
        }
        
        
        System.out.print("Enter 'week' to display the weekly temperatures and average: ");
        String input = scanner.next();
        
        if ("week".equalsIgnoreCase(input)) {
            double totalTemperature = 0.0;
            System.out.println("Daily average temperatures:");
            for (int i = 0; i < days.size(); i++) {
                System.out.println(days.get(i) + ": " + temperatures.get(i) + "°C");
                totalTemperature += temperatures.get(i);
            }
            double weeklyAverage = totalTemperature / temperatures.size();
            System.out.println("Weekly average temperature: " + weeklyAverage + "°C");
        }
        
        
        scanner.close();
    }
}
