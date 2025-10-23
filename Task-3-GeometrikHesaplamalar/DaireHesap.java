public class DaireHesaplama {
    public static void main(String[] args) {
        // Yarıçapı tanımlıyoruz
        double yaricap = 5.5;

        // Alan ve çevre hesaplama
        double alan = Math.PI * yaricap * yaricap;  // π * r^2
        double cevre = 2 * Math.PI * yaricap;       // 2 * π * r

        // Sonuçları ekrana yazdırma
        System.out.println("Dairenin Yaricapi: " + yaricap);
        System.out.printf("Dairenin Alani: %.2f%n", alan);  // 2 ondalık basamak
        System.out.printf("Dairenin Cevresi: %.2f%n", cevre); // 2 ondalık basamak
    }
}
