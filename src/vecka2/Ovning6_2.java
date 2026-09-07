package vecka2;

import java.util.Scanner;

public class Ovning6_2 {
    static void main(String[] args) {
        // Övning 6.2: Validering av input**
        // 1. Frågar efter ålder
        // 2. Fortsätter fråga tills användaren anger ett giltigt tal (1-120)
        // 3. Skriver ut ett meddelande när giltig ålder anges
        boolean ageFormat = false;

        while (!ageFormat) {
            System.out.println("Hur gammal är du? ");
            Scanner sc = new Scanner(System.in);
            int userAge = sc.nextInt();
            if (userAge < 1 || userAge > 120){
                System.out.println("Ogiltigt. Försök igen.");
            } else {
                ageFormat = true;
                System.out.println("Du är: " + userAge);
            }
        }
    }
}
