public class DecisionEngine {

    public static void evaluate(WomanEntrepreneur user, Loan loan) {

        CreditScorer scorer = new CreditScorer();

        int score = scorer.calculateScore(user);
        scorer.explainScore(user);

        System.out.println("Minimum Required Score: "
                + EligibilityEngine.getMinimumScore());

        if (EligibilityEngine.isEligible(score)) {
            loan.setStatus("APPROVED");
            System.out.println("Reason: Meets standardized eligibility criteria.");
        } else {
            loan.setStatus("REJECTED");
            System.out.println("Reason: Score below required threshold.");
        }

        DigitalLedger.log("Loan processed for "
                + user.getId()
                + " | Score: "
                + score
                + " | Status: "
                + loan.getStatus());
    }
}
