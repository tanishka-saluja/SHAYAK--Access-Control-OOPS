class UnauthorizedUser extends User {

    public UnauthorizedUser(String id, String name) {
        super(id, name);
    }

    public void accessDenied(){
        System.out.println("Access Denied.");
    }
}
