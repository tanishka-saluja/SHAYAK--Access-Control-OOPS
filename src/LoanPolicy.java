public class LoanPolicy {

    public static final double INTEREST_RATE = 0.12;
    public static final double PENALTY_RATE = 0.02;

    public static void displayLoanTerms(double amount, int months) {

        double interest = amount * INTEREST_RATE;
        double total = amount + interest;
        double emi = total / months;

        System.out.println("---- Loan Terms ----");
        System.out.println("Interest Rate: 12%");
        System.out.println("Penalty Rate: 2%");
        System.out.println("Total Payable: " + total);
        System.out.println("Monthly EMI: " + emi);
    }
}
