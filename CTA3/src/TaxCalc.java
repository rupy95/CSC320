
public class TaxCalc {

	public static void main(String[] args) {
		double income = 6000; 

        
        double taxRate;
        if (income < 500) {
            taxRate = 0.10; 
        } else if (income < 1500) {
            taxRate = 0.15; 
        } else if (income < 2500) {
            taxRate = 0.20; 
        } else {
            taxRate = 0.30; 
        }

        
        double taxWithholding = income * taxRate;
     
        System.out.println("Your weekly tax withholding amount is: $" + taxWithholding);

	}

}
