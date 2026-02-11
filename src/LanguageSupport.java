public class LanguageSupport {

    public static void displayWelcome(String lang) {

        switch (lang.toUpperCase()) {

            case "HI":
                System.out.println("स्वागत है सहायक प्लेटफॉर्म में");
                break;

            case "TA":
                System.out.println("சஹாயக் தளத்திற்கு வரவேற்கிறோம்");
                break;

            default:
                System.out.println("Welcome to Sahayak Platform");
        }
    }
}
