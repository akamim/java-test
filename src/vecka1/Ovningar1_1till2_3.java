package vecka1;

import java.util.Scanner;

public class Ovningar1_1till2_3 {
    public static void main(String[] args) {
        //Första programmet
        System.out.println("Mitt namn är Akam");
        System.out.println("Jag är 30 år gammal.");
        System.out.println("Jag studerar systemutveckling med testinriktning.");
        System.out.println("Jag vill lära mig programmering för att jag tycker om att lösa problem.");
        // Empty line
        System.out.println(" ");

        // Variabler och matematik
        // variables for length and width of a room
        int length = 2, width = 3;

        // calculation of area of a room
        int roomArea = length * width;

        // calculation of circumference of a room (rectangle)
        int roomCirc = 2 * (length + width);

        // Printing of calculation results
        System.out.println("Arean av rummet är " + roomArea);
        System.out.println("Omkretsen av rummet är " + roomCirc);
        // Empty line
        System.out.println(" ");

        //Personlig presentation
        // - String för namn och favoritmat
        String myName = "Akam", favFood = "pizza";

        // - int för ålder och antal syskon
        int myAge = 30, numOfSiblings = 3;


        // - double för längd i meter
        double lengthInMeters = 1.58d;

        // - boolean för om du gillar kaffe
        boolean likesCoffee = true;

        // Skriv ut en fin presentation av dig själv
        System.out.print("Mitt namn är " + myName + " och min favoritmat är " + favFood + ". ");
        System.out.print("Jag är " + myAge + " år gammal och har " + numOfSiblings + " syskon. ");
        System.out.print("Jag är " + lengthInMeters + "m lång. ");
        if (likesCoffee){
            System.out.println("Och jag gillar kaffe!");
        } else {
            System.out.println("Och jag ogillar kaffe!");
        }


        // Input och Output
        // Skapa ett program som:
        Scanner myObj = new Scanner(System.in);
        // 1. Frågar användaren vad de heter
        System.out.println("Vad heter du?");
        String userName = myObj.nextLine();

        // 2. Frågar hur gammal de är
        System.out.println("Hur gammal är du?");
        int userAge = myObj.nextInt();
        myObj.nextLine();

        // 3. Frågar var de bor
        System.out.println("Var bor du?");
        String userResidence = myObj.nextLine();

        // 4. Skriver ut en personlig hälsning med all information
        System.out.println("Välkommen " + userName + "! " + "Du är " + userAge + " år gammal och bor i " + userResidence);



        // Skapa ett program som:
        // 1. Frågar efter två tal
        System.out.println("Skriv två tal:");
        int firstNum = myObj.nextInt();
        int secondNum = myObj.nextInt();

        // 2. Räknar ut summan
        int sumUserNumbers = firstNum + secondNum;

        // 3. Räknar ut produkten
        int multiplyUserNumbers = firstNum * secondNum;

        // 4. Räknar ut genomsnittet
        int avgUsernumbers = sumUserNumbers / 2;

        // 5. Skriver ut alla resultat
        System.out.println("Summan av dina tal: " + sumUserNumbers + ".");
        System.out.println("Produkten av dina tal: " + multiplyUserNumbers + ".");
        System.out.println("Genomsnittet av dina tal: " + avgUsernumbers + ".");


        // Skapa ett program som:
        // 1. Frågar efter ett belopp i SEK
        System.out.println("Skriv ett belopp (svenska kronor):");
        int priceInSEK = myObj.nextInt();

        // 2. Konverterar till EUR (ca 0.085)
        double priceInEUR = priceInSEK * 0.085;
        // 3. Konverterar till USD (ca 0.091)
        double priceInUSD = priceInSEK * 0.091;
        // 4. Skriver ut alla belopp snyggt formaterat
        System.out.println("Beloppet i EUR: " + priceInEUR + " och i USD: " + priceInUSD + ".");


    }
}
