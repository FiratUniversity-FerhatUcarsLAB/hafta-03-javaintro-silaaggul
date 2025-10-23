public class FaktoriyelHesapla {
    public static void main(String[] args) {
        int sayi = 5; // Faktöriyelini hesaplayacağımız sayı
        int sonuc = 1;

        System.out.print(sayi + "! = ");

        // Faktöriyel hesabı ve ara adımların gösterimi
        for (int i = sayi; i >= 1; i--) {
            sonuc *= i;
            if (i > 1) {
                System.out.print(i + " * ");
            } else {
                System.out.print(i);
            }
        }

        System.out.println("\nSonuç: " + sonuc);
    }
}
