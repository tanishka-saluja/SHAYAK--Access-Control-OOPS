public class WomanEntrepreneur extends User {

    private double monthlyIncome;
    private int yearsInBusiness;
    private String education;

    public WomanEntrepreneur(String id, String name,
                              double monthlyIncome,
                              int yearsInBusiness,
                              String education) {

        super(id, name);
        this.monthlyIncome = monthlyIncome;
        this.yearsInBusiness = yearsInBusiness;
        this.education = education;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public int getYearsInBusiness() {
        return yearsInBusiness;
    }

    public String getEducation() {
        return education;
    }
}
