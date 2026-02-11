public class SahayakSystem {

    public static void main(String[] args) {

        LanguageSupport.displayWelcome("EN");

        WomanEntrepreneur lakshmi =
                new WomanEntrepreneur("L001",
                        "Lakshmi",
                        12000,
                        4,
                        "Graduate");

        Loan loan = new Loan();

        LoanPolicy.displayLoanTerms(50000, 12);

        Verifier officer = new BankVerifier("B101");

        AccessController.processLoan(officer, lakshmi, loan);

        Grievance grievance =
                new Grievance("Need EMI clarification.");
        grievance.register();

        DigitalLedger.showRecords();

        System.out.println("Final Loan Status: " + loan.getStatus());
    }
}
