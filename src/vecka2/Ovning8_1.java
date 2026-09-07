package vecka2;


import java.util.Scanner;

public class Ovning8_1 {
    static void main(String[] args){
        // Övning 8.1: Poängräknare

        // Skapa ett program som:
        // 1. Frågar hur många poäng användaren vill mata in
        Scanner sc = new Scanner(System.in);

            // While-loop ser till att använder skriver minst ett tal
        int desiredLength = -1;

        while (desiredLength <= 0){
            System.out.println("Hur många poäng vill du mata in?");
            desiredLength = sc.nextInt();
            if (desiredLength <= 0){
                System.out.println("Ogiltigt värde, försök igen.");
            }
        }


        // 2. Skapar en array av rätt storlek
        int[] pointsArray = new int[desiredLength];

        // 3. Låter användaren mata in alla poäng
        System.out.println("Mata in dina " + desiredLength + " poäng: ");
        for (int i = 0; i < desiredLength; i++){
            System.out.println("Poäng nummer " + (i+1) + ": ");
            pointsArray[i] = sc.nextInt();
        }

        // 4. Räknar ut:
        //    - Totalpoäng
        int sum = 0;
        for (int point : pointsArray){
            sum += point;
        }
        System.out.println("Totalpoäng: " + sum);

        //    - Medelpoäng
        double avg = (double) sum / pointsArray.length;
        System.out.printf("Medelpoäng: %.2f%n", avg);

        //    - Högsta poäng
        int max = pointsArray[0];
        for (int point : pointsArray){
            if (point > max){
                max = point;
            }
        }
        System.out.println("Högsta poäng: " + max);

        //    - Lägsta poäng
        int min = pointsArray[0];
        for (int point : pointsArray){
            if (point < min){
                min = point;
            }
        }
        System.out.println("Lägsta poäng: " + min);

        //    - Antal poäng över medel
        int numOverAvg = 0;
        for (int point : pointsArray){
            if (point > avg){
                numOverAvg++;
            }
        }
        System.out.println("Antal poäng över medel: " + numOverAvg);

    }
}
