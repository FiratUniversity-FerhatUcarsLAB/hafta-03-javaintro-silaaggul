public class DonusumTablosu {
    public static void main(String[] args) {
        // Mil değerleri
        int[] milDegerleri = {1, 5, 10, 20, 50};
        double ceviriOrani = 1.609; // 1 mil = 1.609 km

        System.out.println("*****************************");
        System.out.println("* Mil   | Kilometre (km)   *");
        System.out.println("*****************************");

        for (int mil : milDegerleri) {
            double km = mil * ceviriOrani;
            System.out.printf("%-6d | %-15.3f\n", mil, km);
        }

        System.out.println("*****************************");
    }
}


