public class SahayakSystem {

    public static void main(String[] args) {

        WomanEntrepreneur lakshmi =
            new WomanEntrepreneur("L001", 12000, 3);

        Loan loan = new Loan();

        Verifier fakeAgent = new UnauthorizedUser("X999");
        AccessController.processLoan(fakeAgent, loan, true);

        Verifier bankOfficer = new BankVerifier("B101");
        AccessController.processLoan(bankOfficer, loan, true);

        System.out.println("Final Loan Status: " + loan.getStatus());
    }
}
