public class ASCIIHarfi {
    public static void main(String[] args) {
        // Baş harf
        char harf = 'S';

        System.out.println("ASCII Art ile '" + harf + "' harfi:");
        System.out.println();

        switch(harf) {
            case 'S':
                System.out.println(" SSSSS ");
                System.out.println("S     S");
                System.out.println("S      ");
                System.out.println(" SSSSS ");
                System.out.println("      S");
                System.out.println("S     S");
                System.out.println(" SSSSS ");
                break;

            default:
                System.out.println("ASCII Art henüz bu harf için tanımlanmadı.");
        }
    }
}
