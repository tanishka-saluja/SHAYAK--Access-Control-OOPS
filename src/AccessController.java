public class AccessController {

    public static void processLoan(Verifier verifier,
                                   User user,
                                   Loan loan) {

        verifier.verify(user, loan);
    }
}
