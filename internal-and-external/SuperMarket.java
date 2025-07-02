class SuperMarket {

    public static void main(String[] args) {
        System.out.println("SuperMarket - Local Declaration");

        String[] iceCreams = {
            "Vanilla", "Chocolate", "Strawberry", "Butterscotch", "Mango", 
            "Pista", "Black Currant", "Choco Chip", "Kesar", "Kulfi"
        };

        String[] perfumes = {
            "Axe", "Fogg", "Denver", "Park Avenue", "Wild Stone", 
            "Skinn", "Yardley", "Nautica", "Guess", "Dior"
        };

        String[] groceries = {
            "Rice", "Wheat", "Dal", "Sugar", "Salt", 
            "Tea", "Coffee", "Oil", "Rava", "Maida"
        };

        String[] cosmetics = {
            "Lipstick", "Foundation", "Compact", "Eyeliner", "Mascara", 
            "Kajal", "Blush", "Nail Polish", "Moisturizer", "Sunscreen"
        };

        System.out.println("Ice Creams:");
        for(String item : iceCreams) {
            System.out.println(item);
        }

        System.out.println("Perfumes:");
        for(String item : perfumes) {
            System.out.println(item);
        }

        System.out.println("Groceries:");
        for(String item : groceries) {
            System.out.println(item);
        }

        System.out.println("Cosmetics:");
        for(String item : cosmetics) {
            System.out.println(item);
        }
    }
}