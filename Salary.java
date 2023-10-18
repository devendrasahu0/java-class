import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter basic salary
        System.out.print("Enter the basic salary: ");
        double basicSalary = input.nextDouble();

        // Calculate and display the net salary
        double netSalary = calculateNetSalary(basicSalary);
        System.out.println("Net Salary: " + netSalary);

        // Close the scanner
        input.close();
    }

    // Function to calculate the net salary
    public static double calculateNetSalary(double basicSalary) {
        // You can define your own rules for calculating the net salary here
        // For example, let's assume a simple calculation:
        double grossSalary = basicSalary + (0.2 * basicSalary); // 20% bonus
        double incomeTax = 0.1 * grossSalary; // 10% income tax
        double netSalary = grossSalary - incomeTax;
        return netSalary;
    }
}
