public class Bonus2_BMI_Sabit {

    public static void main(String[] args) {
        // Sabit kilo ve boy değerleri
        double kilo = 56;        // kg
        double boy = 1.73;       // metre cinsinden

        // BMI hesaplama
        double bmi = kilo / (boy * boy);

        // Hesaplama adımlarını gösterme
        System.out.println("=== Bonus 2 - Vücut Kitle Endeksi (BMI) Hesaplama ===\n");
        System.out.println("Hesaplama Adimlari:");
        System.out.println("BMI = kilo / (boy * boy)");
        System.out.println("BMI = " + kilo + " / (" + boy + " * " + boy + ")");
        System.out.println("BMI = " + String.format("%.2f", bmi));

        // BMI kategorisini ekrana yazdırma
        if (bmi < 18.5) {
            System.out.println("Kategori: Zayıf");
        } else if (bmi < 25) {
            System.out.println("Kategori: Normal");
        } else if (bmi < 30) {
            System.out.println("Kategori: Fazla Kilolu");
        } else {
            System.out.println("Kategori: Obez");
        }
    }
