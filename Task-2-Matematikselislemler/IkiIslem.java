public class IslemSonucu {
    public static void main(String[] args) {
        // Pay ve payda hesapla
        double pay = 9.5 * 4.5 - 2.5 * 3;
        double payda = 45.5 - 3.5;

        // Sonucu hesapla
        double sonuc = pay / payda;

        // 4 ondalık basamakla yazdır
        System.out.printf("islem Sonucu = %.4f%n", sonuc);
    }
}
