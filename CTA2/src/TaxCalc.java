
public class TaxCalc {

	public static void main(String[] args) {
		double income = 6000; // You can change this value to test different income levels

        // Calculate the tax withholding based on income
        double taxRate;
        if (income < 500) {
            taxRate = 0.10; // 10%
        } else if (income < 1500) {
            taxRate = 0.15; // 15%
        } else if (income < 2500) {
            taxRate = 0.20; // 20%
        } else {
            taxRate = 0.30; // 30%
        }

        // Calculate the tax withholding amount
        double taxWithholding = income * taxRate;

        // Display the tax withholding amount
        System.out.println("Your weekly tax withholding amount is: $" + taxWithholding);

	}

}
