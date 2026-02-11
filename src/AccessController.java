class AccessController {

    public static void processLoan(Verifier verifier, Loan loan, boolean approve) {

        if (!verifier.isAuthorized()) {
            AuditLogger.log(verifier.userId, "UNAUTHORIZED ACCESS ATTEMPT");
            System.out.println("Access Denied ");
            return;
        }

        if (approve) {
            loan.approve();
            AuditLogger.log(verifier.userId, "Loan Approved");
        } else {
            loan.reject();
            AuditLogger.log(verifier.userId, "Loan Rejected");
        }
    }
}
