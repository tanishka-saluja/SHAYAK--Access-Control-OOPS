class WomanEntrepreneur extends User {
    private double income;
    private int businessYears;

    public WomanEntrepreneur(String id, double income, int years) {
        super(id, "APPLICANT");
        this.income = income;
        this.businessYears = years;
    }

    public double getIncome() {
        return income;
    }

    public int getBusinessYears() {
        return businessYears;
    }
}
