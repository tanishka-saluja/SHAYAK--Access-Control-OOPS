class WomanEntrepreneur extends User {
    private double income;
    private int businessYears;
    private String educationLevel; 

    public WomanEntrepreneur(String id, double income, int years, String educationLevel) {
        super(id, "APPLICANT");
        this.income = income;
        this.businessYears = years;
        this.educationLevel = educationLevel;
    }

    public double getIncome() {
        return income;
    }

    public int getBusinessYears() {
        return businessYears;
    }

    public String getEducationLevel() {
        return educationLevel;
    }
}
