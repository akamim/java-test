package vecka2;


import java.util.Scanner;

public class Ovning10_1 {
    static void main(String[] args) {

        // Övning 10.1: Enkel skoladministration**
        // Skapa ett program som:


        // 1. Frågar efter antal studenter
        int numOfStudents = 0;
        Scanner sc = new Scanner(System.in);
            // While-loop för att säkerställa att antal student ej blir 0 eller neg.
        while (numOfStudents <= 0){

        System.out.println("Skriv antal studenter: ");
        if (sc.hasNextInt()){
            numOfStudents = sc.nextInt();
            sc.nextLine();
            if (numOfStudents <= 0){
                System.out.println("Ogiltigt antal, försök igen.");
            }
        } else{
            System.out.println(" Du måste skriva ett heltal.");
            sc.nextLine();
            }
        }

        // 2. För varje student:
            // Array för att spara studentinformation
                //Array för namn på studenter
        String[] studentNames = new String[numOfStudents];
                // Array för 3 betyg.
        int[][] studentGrades = new int[numOfStudents][3];
                // Array för att spara G och IG
        String[] passOrNot = new String[numOfStudents];
                // Array för medelbetyg
        double[] studentAverages = new double[numOfStudents];


        for (int i = 0; i < numOfStudents; i++){

            //    - Frågar efter namn
            System.out.println("Vad heter studenten? ");
            studentNames[i] = sc.nextLine();

            //    - Frågar efter 3 betyg
            System.out.println("Skriv 3 betyg: ");
            for (int j = 0; j < 3; j++){
                boolean validInput = false;
                while (!validInput){
                    System.out.println("Betyg (0-100) " + (j + 1) + ": ");
                    if (sc.hasNextInt()){
                        int grade = sc.nextInt();
                        sc.nextLine();
                        if (grade < 0 || grade > 100){
                            System.out.println("Betyget måste vara mellan 0 och 100. Försök igen: ");
                        } else {
                            studentGrades[i][j] = grade;
                            validInput = true;
                        }
                    } else {
                        System.out.println("Du måste skriva ett heltal. Försök igen: ");
                        sc.nextLine();
                    }

                }
            }

            //- Räknar ut medelbetyg
            studentAverages[i] = (studentGrades[i][0] + studentGrades[i][1] + studentGrades[i][2])/3.0;

            //    - Avgör om studenten är godkänd (medel >= 60)
            if (studentAverages[i] >= 60){
                passOrNot[i] = "Godkänd";
            } else {
                passOrNot[i] = "Icke-godkänd";
            }
        }



        // 3. Skriver ut en rapport med:

        //    - Alla studenters namn och medelbetyg
        for (int i = 0; i < numOfStudents; i++){
            System.out.println("Studentnamn: " + studentNames[i]);
                System.out.println("    Betyg: " + studentGrades[i][0] +
                        ", " + studentGrades[i][1] + ", " + studentGrades[i][2] + ".");
                System.out.printf("Medelbetyg: %.1f%n", studentAverages[i]);
                System.out.println("Status: " + passOrNot[i]);
        }

        //    - Antal godkända studenter
        int passedStudents = 0;
        for (String status : passOrNot){
            if (status.equalsIgnoreCase("godkänd")){
                passedStudents++; }
        }
        System.out.println("Antal godkända studenter: " + passedStudents);

        //    - Klassens medelbetyg
        double sumOfAverages = 0;

        for (double average : studentAverages){
            sumOfAverages += average;
        }
        double avgOfClass = sumOfAverages /numOfStudents;

        System.out.printf("Klassens medelbetyg: %.1f%n", avgOfClass);
    }
}
