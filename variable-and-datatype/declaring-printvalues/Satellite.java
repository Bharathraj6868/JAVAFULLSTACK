public class Satellite {
    static String name = "GeoSat-1";
    static String operator = "SpaceCom";
    static String launchDate = "2023-07-15";
    static String orbitType = "GEO";
    static double missionDuration = 15.0;
    static String status = "Operational";
    static double weight = 1200.0;
    static String manufacturer = "Orbital Inc.";
    static int powerOutput = 5000;
    static boolean solarPowered = true;
    static int transponders = 24;
    static String frequencyBand = "Ku-band";
    static boolean isEncrypted = true;
    static String country = "USA";
    static String purpose = "Communications";
    static String groundStation = "Station X";
    static boolean hasCamera = false;
    static boolean isActive = true;
    static String decommissionDate = "";
    static String controlCenterContact = "contact@spacecom.com";

    public static void main(String[] args) {
        System.out.println("name: " + name);
        System.out.println("operator: " + operator);
        System.out.println("launchDate: " + launchDate);
        System.out.println("orbitType: " + orbitType);
        System.out.println("missionDuration: " + missionDuration);
        System.out.println("status: " + status);
        System.out.println("weight: " + weight);
        System.out.println("manufacturer: " + manufacturer);
        System.out.println("powerOutput: " + powerOutput);
        System.out.println("solarPowered: " + solarPowered);
        System.out.println("transponders: " + transponders);
        System.out.println("frequencyBand: " + frequencyBand);
        System.out.println("isEncrypted: " + isEncrypted);
        System.out.println("country: " + country);
        System.out.println("purpose: " + purpose);
        System.out.println("groundStation: " + groundStation);
        System.out.println("hasCamera: " + hasCamera);
        System.out.println("isActive: " + isActive);
        System.out.println("decommissionDate: " + decommissionDate);
        System.out.println("controlCenterContact: " + controlCenterContact);
    }
}