package vecka3;

import java.util.Scanner;

public class Lektion080926_Ov2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hur många temperaturer vill du registrera?");
        int numberOfDays = 0;

        while (numberOfDays <= 0){
            numberOfDays = sc.nextInt();
            if (numberOfDays <= 0){
                System.out.println("Du måste registerar minst en termperatur. Försök igen: ");
            }
        }
        int [] temperatures = new int[numberOfDays];

        int sum = 0;
        for (int i = 0; i < temperatures.length; i++){
            System.out.println("Ange temperatur för dag " + (i + 1) + ": ");
            temperatures[i] = sc.nextInt();
            sum += temperatures[i];
        }


        System.out.println("\n __ Registrerade temperaturer__");
        for (int i = 0; i < temperatures.length; i++){
            System.out.println("Dag " + (i + 1) + ": " + temperatures[i] + " grader.");
        }

        double avgTemp = (double) sum/temperatures.length;
        System.out.printf("Medeltemperatur: %.2f", avgTemp);
    }
}
