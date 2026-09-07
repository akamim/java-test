package vecka2;

import java.util.Scanner;

public class Ovning5_3 {
    static void main(String[] args) {
        //Gissa talet (enkel version)
        // Skapa ett program som:
        // 1. Har ett hemligt tal (hårdkodat, t.ex. 42)
        int secretNumber = 100;
        // 2. Låter användaren gissa tills de får rätt
        boolean gussedRight = false;
        int numOfGueses = 0;

        // 3. Säger "för högt" eller "för lågt" efter varje gissning
        while (!gussedRight){
            System.out.println("Gissa ett nummer som är mellan 0-100: ");
            Scanner sc = new Scanner(System.in);
            int userGuess = sc.nextInt();
            if (userGuess > secretNumber) {
                System.out.println("För högt.");
                numOfGueses++;
            } else if (userGuess < secretNumber) {
                System.out.println("För lågt.");
                numOfGueses++;
            } else if (userGuess == secretNumber) {
                gussedRight = true;
                numOfGueses++;
                // 4. Räknar antal gissningar och skriver ut det när de får rätt
                System.out.println("Du vann." + " Du gissade: " + numOfGueses + " ggr.");
            }
        }


    }
}
