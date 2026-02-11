public class EligibilityEngine {

    private static final int MIN_SCORE = 60;

    public static boolean isEligible(int score) {
        return score >= MIN_SCORE;
    }

    public static int getMinimumScore() {
        return MIN_SCORE;
    }
}
