class AccessController {

    public static void processLoan(Verifier verifier, WomanEntrepreneur w, Loan loan) {

        if (!verifier.isAuthorized()) {
            AuditLogger.log(verifier.userId, "UNAUTHORIZED ACCESS ATTEMPT");
            System.out.println("Access Denied ");
            return;
        }

        int score = CreditScorer.calculateScore(w);

        if (score >= 60) {
            loan.approve();
            AuditLogger.log(verifier.userId, "Loan Approved | Score: " + score);
        } else {
            loan.reject();
            AuditLogger.log(verifier.userId, "Loan Rejected | Score: " + score);
        }
    }
}
