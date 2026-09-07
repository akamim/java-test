package vecka2;

import java.util.Scanner;

public class Ovning7_2 {
    static void main(String[] args) {
        // Övning 7.2: Temperaturlogger
        // Skapa ett program som:
        // 1. Frågar efter temperaturen för varje dag i veckan
        // 2. Sparar alla temperaturer i en array
        // 3. Skriver ut alla temperaturer
        // 4. Räknar ut medeltemperaturen
        // 5. Hittar varmaste och kallaste dagen

        // Skapar array för att spara temperaturen för varje dag i veckan
        int[] weekTemperatures = new int[7];

        // Skapar array för veckodagar
        String[] daysOfWeek = {"Måndag", "Tisdag", "Onsdag", "Torsdag", "Fredag", "Lördag", "Söndag"};

        // Skapar scanner obj för att ta emot input från användaren
        Scanner sc = new Scanner(System.in);

        // Variabel för summering av temperaturer
        double temperatureSum = 0.0;

        // Loop för att fråga efter temperaturen för varje dag i veckan + summerar alla temperaturer
        for (int i = 0; i < weekTemperatures.length; i++){
            System.out.println("Vad var temperaturen på " + daysOfWeek[i].toLowerCase() + " ?");
            weekTemperatures[i] = sc.nextInt();
            temperatureSum += weekTemperatures[i];
        }

        // Skriver ut alla temperaturer
        for (int i = 0; i < weekTemperatures.length; i++) {
            System.out.println(daysOfWeek[i] + ": " + weekTemperatures[i] + "°C");
        }

        // Räknar ut medeltemperaturen och skriver ut svaret
        double averageTemperature = temperatureSum / weekTemperatures.length;
        System.out.printf("Medeltemperaturen för veckan: %.1f°C%n", averageTemperature);

        // Hittar varmaste och kallaste dagen
        int indexOfHottestDay = 0;
        int indexOfColdestDay = 0;

        for (int i = 1; i < weekTemperatures.length; i++){
            if (weekTemperatures[i] > weekTemperatures[indexOfHottestDay]){
                indexOfHottestDay = i;
            }
            if (weekTemperatures[i] < weekTemperatures[indexOfColdestDay]){
                indexOfColdestDay = i;
            }
        }
        System.out.println("Varmaste dagen av veckan: " + daysOfWeek[indexOfHottestDay] + " (" + weekTemperatures[indexOfHottestDay]+ "°C)");
        System.out.println("Kallaste dagen av veckan: " + daysOfWeek[indexOfColdestDay] + " (" + weekTemperatures[indexOfColdestDay]+ "°C)");

    }
}
