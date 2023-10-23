public class SimpleInterestCalculator {

    // Function to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        // Simple Interest formula: SI = (P * R * T) / 100
        double simpleInterest = (principal * rate * time) / 100;
        return simpleInterest;
    }

    public static void main(String[] args) {
        double principal = 1000; // Principal amount
        double rate = 5;       // Rate of interest (in percent)
        double time = 2;       // Time (in years)

        // Calculate simple interest using the function
        double interest = calculateSimpleInterest(principal, rate, time);

        System.out.println("Principal amount: $" + principal);
        System.out.println("Rate of interest: " + rate + "%");
        System.out.println("Time (in years): " + time);
        System.out.println("Simple Interest: $" + interest);
    }
}
