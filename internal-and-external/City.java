class City {

    public static void main(String[] args) {
        System.out.println("main started");

        String pin1 = "560001"; // MG Road
        String pin2 = "560002"; // Chickpet
        String pin3 = "560003"; // Malleshwaram
        String pin4 = "560004"; // Basavanagudi
        String pin5 = "560005"; // Fraser Town
        String pin6 = "560006"; // Rajajinagar
        String pin7 = "560007"; // Shivajinagar
        String pin8 = "560008"; // Ulsoor
        String pin9 = "560009"; // Chickpet (old city)
        String pin10 = "560010"; // Vijayanagar
        String pin11 = "560011"; // Jayanagar
        String pin12 = "560012"; // Yeshwanthpur
        String pin13 = "560013"; // Mathikere

        String[] pinCodes = {
            pin1, pin2, pin3, pin4, pin5,
            pin6, pin7, pin8, pin9, pin10,
            pin11, pin12, pin13
        };

        System.out.println("Bangalore City - Pin Codes:");
        for (String pin : pinCodes) {
            System.out.println(pin);
        }

        System.out.println("main ended");
    }
}