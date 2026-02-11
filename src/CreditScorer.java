public class CreditScorer {

    public int calculateScore(WomanEntrepreneur user) {

        int score = 0;

        if (user.getMonthlyIncome() >= 15000)
            score += 30;
        else if (user.getMonthlyIncome() >= 10000)
            score += 25;
        else
            score += 15;

        if (user.getYearsInBusiness() >= 5)
            score += 25;
        else if (user.getYearsInBusiness() >= 3)
            score += 20;
        else
            score += 10;

        score += EducationPolicy.getEducationPoints(user.getEducation());

        return score;
    }

    public void explainScore(WomanEntrepreneur user) {

        int score = calculateScore(user);

        System.out.println("---- Credit Score Breakdown ----");
        System.out.println("Income: " + user.getMonthlyIncome());
        System.out.println("Years in Business: " + user.getYearsInBusiness());
        System.out.println("Education: " + user.getEducation());
        System.out.println("Final Credit Score: " + score);
    }
}
