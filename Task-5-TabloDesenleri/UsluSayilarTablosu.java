public class UsluSayilar {
    public static void main(String[] args) {
        System.out.println("***************************");
        System.out.println("*  Sayi  |  Kare  |  Kup  *");
        System.out.println("***************************");

        for (int a = 1; a <= 5; a++) {
            int karesi = a * a;
            int kupu = a * a * a;
            System.out.printf("%5d   | %5d  | %5d\n", a, karesi, kupu);
        }

        System.out.println("***************************");
    }
}
