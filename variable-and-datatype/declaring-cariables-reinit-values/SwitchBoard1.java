public class SwitchBoard1 {
    static String  boardID;
    static int     numberOfSwitches;
    static boolean mainBreaker;
    static String  voltageRating;
    static double  currentCapacity;
    static boolean isWaterproof;
    static String  material;
    static String  manufacturer;
    static String  modelNumber;
    static double  weight;
    static String  color;
    static boolean hasIndicatorLED;
    static String  installationType;
    static int     warrantyYears;
    static boolean residualCurrentDevice;
    static boolean overCurrentProtection;
    static String  countryOfOrigin;
    static boolean isSmartEnabled;
    static String  connectivityType;
    static String  certification;

    public static void main(String[] args) {
        System.out.println("boardID: " + boardID);
        boardID = "SBX100";
        System.out.println("boardID: " + boardID);

        System.out.println("numberOfSwitches: " + numberOfSwitches);
        numberOfSwitches = 4;
        System.out.println("numberOfSwitches: " + numberOfSwitches);

        System.out.println("mainBreaker: " + mainBreaker);
        mainBreaker = true;
        System.out.println("mainBreaker: " + mainBreaker);

        System.out.println("voltageRating: " + voltageRating);
        voltageRating = "220V";
        System.out.println("voltageRating: " + voltageRating);

        System.out.println("currentCapacity: " + currentCapacity);
        currentCapacity = 40.0;
        System.out.println("currentCapacity: " + currentCapacity);

        System.out.println("isWaterproof: " + isWaterproof);
        isWaterproof = false;
        System.out.println("isWaterproof: " + isWaterproof);

        System.out.println("material: " + material);
        material = "Plastic";
        System.out.println("material: " + material);

        System.out.println("manufacturer: " + manufacturer);
        manufacturer = "SwitchCo";
        System.out.println("manufacturer: " + manufacturer);

        System.out.println("modelNumber: " + modelNumber);
        modelNumber = "SC-204";
        System.out.println("modelNumber: " + modelNumber);

        System.out.println("weight: " + weight);
        weight = 0.5;
        System.out.println("weight: " + weight);

        System.out.println("color: " + color);
        color = "White";
        System.out.println("color: " + color);

        System.out.println("hasIndicatorLED: " + hasIndicatorLED);
        hasIndicatorLED = true;
        System.out.println("hasIndicatorLED: " + hasIndicatorLED);

        System.out.println("installationType: " + installationType);
        installationType = "Wall-mounted";
        System.out.println("installationType: " + installationType);

        System.out.println("warrantyYears: " + warrantyYears);
        warrantyYears = 2;
        System.out.println("warrantyYears: " + warrantyYears);

        System.out.println("residualCurrentDevice: " + residualCurrentDevice);
        residualCurrentDevice = true;
        System.out.println("residualCurrentDevice: " + residualCurrentDevice);

        System.out.println("overCurrentProtection: " + overCurrentProtection);
        overCurrentProtection = true;
        System.out.println("overCurrentProtection: " + overCurrentProtection);

        System.out.println("countryOfOrigin: " + countryOfOrigin);
        countryOfOrigin = "India";
        System.out.println("countryOfOrigin: " + countryOfOrigin);

        System.out.println("isSmartEnabled: " + isSmartEnabled);
        isSmartEnabled = false;
        System.out.println("isSmartEnabled: " + isSmartEnabled);

        System.out.println("connectivityType: " + connectivityType);
        connectivityType = "None";
        System.out.println("connectivityType: " + connectivityType);

        System.out.println("certification: " + certification);
        certification = "ISI";
        System.out.println("certification: " + certification);
    }
}