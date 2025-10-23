public class UcgenHesaplama {
    public static void main(String[] args) {
        // Üçgenin kenarlarını tanımlıyoruz
        double a = 3;
        double b = 4;
        double c = 5;

        // Yarı çevreyi hesaplıyoruz
        double s = (a + b + c) / 2;

        // Alanı Heron formülü ile hesaplıyoruz
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Çevreyi hesaplama
        double cevre = a + b + c;

        // Sonuçları ekrana yazdırma
        System.out.println("Ucgenin Kenarlari: a=" + a + ", b=" + b + ", c=" + c);
        System.out.printf("Ucgenin Alani: %.2f%n", alan);   // 2 ondalık basamak
        System.out.printf("Ucgenin Cevresi: %.2f%n", cevre); // 2 ondalık basamak
    }
}
