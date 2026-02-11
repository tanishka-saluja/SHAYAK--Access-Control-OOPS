public class Grievance {

    private String complaint;

    public Grievance(String complaint) {
        this.complaint = complaint;
    }

    public void register() {
        DigitalLedger.log("Complaint Registered: " + complaint);
        System.out.println("Grievance Submitted Successfully.");
    }
}
