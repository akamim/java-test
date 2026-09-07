package vecka2;

import java.util.Arrays;
import java.util.Scanner;

public class Ovning8_2 {
    public static void main(String[] args){
        // Namnlista
        // Skapa ett program som:
        // 1. Frågar hur många namn användaren vill mata in
        Scanner sc = new Scanner(System.in);

        // While-loop ser till att använder skriver minst ett tal
        int numOfUsers = -1;

        while (numOfUsers <= 0){
            System.out.println("Hur många namn vill du mata in? ");
            numOfUsers = sc.nextInt();
            if (numOfUsers <= 0){
                System.out.println("Ogiltigt värde, försök igen.");
            }
        }

        // Läs bort radbrytningen efter det sista nextInt()
        sc.nextLine();

        // 2. Skapar en String-array av rätt storlek
        String[] users = new String[numOfUsers];

        // 3. Låter användaren mata in alla namn
        System.out.println("Mata in namn på användare:");
        for (int i = 0; i < numOfUsers; i++){
            System.out.println("Användare nummer " + (i + 1) + ": ");
            users[i] = sc.nextLine().trim();
        }

        // 4. Skriver ut alla namn i alfabetisk ordning (använd Arrays.sort())
        Arrays.sort(users);
        System.out.println(Arrays.toString(users));

        // 5. Låter användaren söka efter ett namn
        System.out.println("Sök efter ett namn: ");
        String searchQuery = sc.nextLine().trim();

        boolean nameFound = false;

        for (String user : users){
            if (user.equalsIgnoreCase(searchQuery)){
                nameFound = true;
                break;
            }
        }

        if (nameFound){
            System.out.println("Namnet \"" + searchQuery + "\" finns i arrayen.");
        } else {
            System.out.println("Namnet finns ej i arrayen.");
        }
    }
}
