public class DikdortgenHesaplama {
    public static void main(String[] args) {
        // Dikdörtgenin en ve boyunu tanımlıyoruz
        double en = 4.5;
        double boy = 7.9;

        // Alan ve çevre hesaplama
        double alan = en * boy;           // Alan = en * boy
        double cevre = 2 * (en + boy);    // Çevre = 2 * (en + boy)

        // Sonuçları ekrana yazdırma
        System.out.println("Dikdortgenin En: " + en);
        System.out.println("Dikdortgenin Boy: " + boy);
        System.out.printf("Dikdortgenin Alani: %.2f%n", alan);   // 2 ondalık basamak
        System.out.printf("Dikdortgenin Cevresi: %.2f%n", cevre); // 2 ondalık basamak
    }
}

