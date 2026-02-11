class AuditLogger {

    public static void log(String userId, String action) {
        System.out.println("[AUDIT LOG] User: " + userId + " | Action: " + action);
    }
}
