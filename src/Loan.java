class Loan {
    private String status = "PENDING";

    public void approve() {
        status = "APPROVED";
    }

    public void reject() {
        status = "REJECTED";
    }

    public String getStatus() {
        return status;
    }
}
