class BankVerifier extends Verifier {

    public BankVerifier(String id) {
        super(id, "AUTHORIZED_VERIFIER");
    }

    @Override
    public boolean isAuthorized() {
        return true;
    }
}
