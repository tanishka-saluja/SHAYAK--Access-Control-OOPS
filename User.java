abstract class User {
    protected String userId;
    protected String role;

    public User(String userId, String role) {
        this.userId = userId;
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
