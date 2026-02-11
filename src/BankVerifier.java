public class BankVerifier implements Verifier {

    private String officerId;

    public BankVerifier(String officerId) {
        this.officerId = officerId;
    }

    @Override
    public void verify(WomanEntrepreneur user, Loan loan) {

        System.out.println("Bank Officer ID: " + officerId);
        System.out.println("Verifying loan using standardized system...");

        DecisionEngine.evaluate(user, loan);
    }
}
