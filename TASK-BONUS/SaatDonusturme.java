
public class Main {
    public static void main(String[] args) {
        int saniye = 4500;

        int saat = saniye / 3600;
        int dakika = (saniye % 3600) / 60;
        int saniyeKalan = saniye % 60;

        System.out.printf("%d:%02d:%02d\n", saat, dakika, saniyeKalan);
    }
}
