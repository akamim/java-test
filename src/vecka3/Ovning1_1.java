package vecka3;

public class Ovning1_1 {
    static void main(String[] args) {

        //Övning 1.1: Första metoden
        // Skapa ett program som:
        // 1. Har en main-metod som skriver "Programmet startar"
        System.out.println("Programmet startar");

        // 2. Anropar en metod som heter printWelcome()
        // 3. printWelcome() ska skriva ut en välkomsttext
        printWelcome();

        // 4. main skriver sedan "Programmet avslutas"
        System.out.println("Programmet avslutas");

        // Förväntad output:
        // Programmet startar
        // Välkommen till mitt program!
        // Programmet avslutas

        }
        public static void printWelcome(){
            System.out.println("Välkommen till mitt program!");
        }
}
