public class HesapOzeti {
    public static void main(String[] args) {
        // Ürün bilgilerini dizilerde tutalım
        String[] urunler = {"tost", "ayran", "ketcap"};
        int[] miktarlar = {3, 2, 1};
        double[] fiyatlar = {2.5, 3.0, 4.5};

        // Başlık
        System.out.println("********************************");
        System.out.println("*        HESAP OZETI           *");
        System.out.println("********************************");

        // Tablo başlığı
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Urun", "Miktar", "Fiyat", "Toplam");

        // Ürünleri tablo olarak yazdırma
        for (int i = 0; i < urunler.length; i++) {
            double toplam = miktarlar[i] * fiyatlar[i];
            System.out.printf("%-10s %-10d %-10.2f %-10.2f\n", urunler[i], miktarlar[i], fiyatlar[i], toplam);
        }

        // Genel toplam
        double genelToplam = 0;
        for (int i = 0; i < fiyatlar.length; i++) {
            genelToplam += miktarlar[i] * fiyatlar[i];
        }
        System.out.println("********************************");
        System.out.printf("Genel Toplam: %.2f TL\n", genelToplam);
    }
}
