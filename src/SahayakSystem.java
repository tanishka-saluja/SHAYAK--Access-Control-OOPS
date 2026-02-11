public class SahayakSystem {

    public static void main(String[] args) {

        WomanEntrepreneur lakshmi =
            new WomanEntrepreneur("L001", 12000, 3, "Graduate");

        Loan loan = new Loan();

        Verifier officer = new BankVerifier("B101");
        AccessController.processLoan(officer, lakshmi, loan);

        System.out.println("Final Loan Status: " + loan.getStatus());
    }
}
