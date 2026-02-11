abstract class Verifier extends User {

    public Verifier(String id, String role) {
        super(id, role);
    }

    public abstract boolean isAuthorized();
}
