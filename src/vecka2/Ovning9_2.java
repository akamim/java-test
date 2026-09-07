package vecka2;

import java.util.Scanner;

public class Ovning9_2 {
    static void main(String[] args) {
        // Palindrom-kontroll
        // Skapa ett program som:
        // 1. Frågar efter ett ord
        boolean invalidInput = true;
        String wordByUser = "";

            // While-loop för att se till att användaren matar in ett ord.
        while (invalidInput){
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv ett ord: ");
        wordByUser = sc.nextLine().trim().toLowerCase();

        if (wordByUser.isEmpty()){
            System.out.println("Du måste skriva ett ord. Försök igen.");
        } else {
            invalidInput = false;
            }

        }

        // 2. Kontrollerar om det är ett palindrom (läses likadant baklänges)
        String wordReversed = "";
        for (int i = wordByUser.length() - 1; i >=0 ; i--){
            wordReversed += wordByUser.charAt(i);
        }
        if (wordByUser.equals(wordReversed)){
            System.out.println("Ordet " + wordByUser + " är ett palindrom.");
        } else {
            System.out.println("Ordet " + wordByUser + " är inte ett palindrom.");
        }

        // 3. Ignorerar stora/små bokstäver
            // löst med .toLowerCase()

        // Exempel: "Anna" är ett palindrom, "Hej" är inte
    }
}
