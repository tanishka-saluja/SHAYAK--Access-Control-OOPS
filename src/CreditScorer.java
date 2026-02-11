class CreditScorer {

    public static int calculateScore(WomanEntrepreneur w) {
        int score = 0;

        // Base financial criteria
        if (w.getIncome() >= 10000) score += 30;
        if (w.getBusinessYears() >= 2) score += 20;

        // Education-based preference (transparent)
        switch (w.getEducationLevel().toLowerCase()) {
            case "postgraduate":
                score += 25;
                break;
            case "graduate":
                score += 20;
                break;
            case "diploma":
                score += 15;
                break;
            case "school":
                score += 10;
                break;
            default:
                score += 5;
        }

        return score;
    }
}
