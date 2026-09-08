package vecka3;

import java.util.Scanner;

public class lektion080926 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hur många heltal ska registreras?");
        int numberOfValues = 0;

        while (numberOfValues <= 0){
            numberOfValues = sc.nextInt();
            if (numberOfValues <= 0){
                System.out.println("Ogiltigt värde, försök igen");
            }
        }


        int[] numbers = new int[numberOfValues];

        System.out.println("Arrayen har " + numbers.length + " platser.");

        for (int index = 0; index < numbers.length; index++){
            System.out.println("Ange tal " + (index + 1) + ": ");
            numbers [index] = sc.nextInt();
        }

        int sum = 0;
        System.out.println("\n __ Dina tal __");
        for (int i = 0; i < numbers.length; i++){
            System.out.println("Tal " + (i + 1) + ": " + numbers[i]);
            sum += numbers[i];
        }
        System.out.println("Summan av talen: " + sum);

    }
}
