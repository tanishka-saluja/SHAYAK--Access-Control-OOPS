class UnauthorizedUser extends Verifier {

    public UnauthorizedUser(String id) {
        super(id, "UNAUTHORIZED");
    }

    @Override
    public boolean isAuthorized() {
        return false;
    }
}
