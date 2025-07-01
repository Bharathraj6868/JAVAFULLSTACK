public class Desktop1 {
    static String  brand;
    static String  processor;
    static int     ram;
    static int     storage;
    static String  os;
    static int     usbPorts;
    static boolean bluetooth;
    static boolean wifi;
    static String  color;
    static String  storageType;
    static double  weight;
    static boolean opticalDrive;
    static String  monitorSize;
    static boolean webcam;
    static String  keyboardType;
    static boolean upsIncluded;
    static double  price;
    static String  model;
    static boolean touchScreen;
    static boolean hdmiPort;

    public static void main(String[] args) {
        System.out.println("brand: " + brand);
        brand = "lenovo";
        System.out.println("brand: " + brand);

        System.out.println("processor: " + processor);
        processor = "Intel i5";
        System.out.println("processor: " + processor);

        System.out.println("ram: " + ram);
        ram = 14;
        System.out.println("ram: " + ram);

        System.out.println("storage: " + storage);
        storage = 1024;
        System.out.println("storage: " + storage);

        System.out.println("os: " + os);
        os = "Windows 11";
        System.out.println("os: " + os);

        System.out.println("usbPorts: " + usbPorts);
        usbPorts = 8;
        System.out.println("usbPorts: " + usbPorts);

        System.out.println("bluetooth: " + bluetooth);
        bluetooth = true;
        System.out.println("bluetooth: " + bluetooth);

        System.out.println("wifi: " + wifi);
        wifi = true;
        System.out.println("wifi: " + wifi);

        System.out.println("color: " + color);
        color = "white";
        System.out.println("color: " + color);

        System.out.println("storageType: " + storageType);
        storageType = "SSD";
        System.out.println("storageType: " + storageType);

        System.out.println("weight: " + weight);
        weight = 6.5;
        System.out.println("weight: " + weight);

        System.out.println("opticalDrive: " + opticalDrive);
        opticalDrive = false;
        System.out.println("opticalDrive: " + opticalDrive);

        System.out.println("monitorSize: " + monitorSize);
        monitorSize = "28 inch";
        System.out.println("monitorSize: " + monitorSize);

        System.out.println("webcam: " + webcam);
        webcam = false;
        System.out.println("webcam: " + webcam);

        System.out.println("keyboardType: " + keyboardType);
        keyboardType = "Mechanical";
        System.out.println("keyboardType: " + keyboardType);

        System.out.println("upsIncluded: " + upsIncluded);
        upsIncluded = false;
        System.out.println("upsIncluded: " + upsIncluded);

        System.out.println("price: " + price);
        price = 90000.0;
        System.out.println("price: " + price);

        System.out.println("model: " + model);
        model = "EliteDesk 800";
        System.out.println("model: " + model);

        System.out.println("touchScreen: " + touchScreen);
        touchScreen = false;
        System.out.println("touchScreen: " + touchScreen);

        System.out.println("hdmiPort: " + hdmiPort);
        hdmiPort = true;
        System.out.println("hdmiPort: " + hdmiPort);
    }
}