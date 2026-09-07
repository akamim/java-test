package vecka2;
import java.util.Scanner;

public class Ovning3_1 {
    public static void main(String[] args) {

    // Övning 3.1: Ålderskontroll**
    // Skapa ett program som:

    // 1. Frågar efter användarens ålder
        Scanner sc = new Scanner(System.in);
        System.out.println("Hur gammal är du?");
        int age = sc.nextInt();

        // 2. Talar om de får köra bil (18+)
        // 3. Talar om de får köpa alkohol (20+)
        // 4. Talar om de får gå på Systembolaget (20+)
        // 5. Talar om de är pensionärer (65+)

        if (age > 65) {
            System.out.println("""
                    Du får:
                    Köra bil: Ja
                    Köpa alkohol: Ja
                    Gå på Systembolaget: Ja
                    Du är pensionär.
                    """);
        } else if (age > 20) {
            System.out.println("""
                    Du får:
                    Köra bil: Ja
                    Köpa alkohol: Ja
                    Gå på Systembolaget: Ja
                    """);
        } else if (age <= 18) {
            System.out.println("""
                    Du får:
                    Köra bil: Ja
                    Köpa alkohol: Nej
                    Gå på Systembolaget: Nej
                    """);
        }


    }
}
