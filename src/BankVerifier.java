public class BankVerifier implements Verifier {

    private String officerId;

    public BankVerifier(String officerId) {
        this.officerId = officerId;
    }

    @Override
    public void verify(User user, Loan loan) {

        if (user instanceof WomanEntrepreneur) {

            System.out.println("Bank Officer ID: " + officerId);
            System.out.println("Processing loan via standardized system...");

            DecisionEngine.evaluate((WomanEntrepreneur) user, loan);

        } else {
            System.out.println("Only registered women entrepreneurs can apply.");
        }
    }
}
