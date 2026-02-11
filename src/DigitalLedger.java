import java.util.ArrayList;

public class DigitalLedger {

    private static ArrayList<String> records = new ArrayList<>();

    public static void log(String entry) {
        records.add(entry);
        AuditLogger.logAction(entry);
    }

    public static void showRecords() {
        System.out.println("---- Digital Records ----");
        for (String record : records) {
            System.out.println(record);
        }
    }
}
