package vecka2;

import java.util.Scanner;

public class Ovning9_1 {
    static void main(String[] args) {
        // 9.1: Textanalys
        // Skapa ett program som:
        // 1. Frågar användaren att skriva en mening
        System.out.println("Skriv en mening: ");
        Scanner sc = new Scanner(System.in);
        String userSentence = sc.nextLine();

        // 2. Räknar antal tecken
        int countWithoutSpaces = userSentence.replace(" ","").length();
        System.out.println("Antal tecken utan mellanslag: " + countWithoutSpaces + ".");

        // 3. Räknar antal ord
                // Skapar en scanner för att läsa strängen
            Scanner stringScanner = new Scanner(userSentence);
            int wordCount = 0;
            while (stringScanner.hasNext()) {
                stringScanner.next();
                wordCount++;
            }
        stringScanner.close();
        System.out.println("Antal ord i din mening: " + wordCount + ".");

        // 4. Räknar antal vokaler (a, e, i, o, u, y)
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        int vowelCount = 0;
        for (int i = 0; i < userSentence.length(); i++){
            for (int j = 0; j < vowels.length; j++){
                if (Character.toLowerCase(userSentence.charAt(i)) == vowels[j]){
                    vowelCount++;
                }
            }
        }
        System.out.println("Antal vokaler: " + vowelCount + ".");

        // 5. Skriver ut allt som versaler
        System.out.println(userSentence.toUpperCase());

        // 6. Skriver ut allt som gemener
        System.out.println(userSentence.toLowerCase());
    }
}
