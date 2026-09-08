package vecka3;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ProgramA {
    static void main(String[] args) {
        // Program A: Interaktiv quiz
        // Bygg ett quiz-program som:
        // 1. Har 5 frågor med 4 svarsalternativ vardera
        // 2. Låter användaren välja svar för varje fråga
        // 3. Håller koll på antal rätta svar
        // 4. Ger feedback efter varje fråga
        // 5. Visar slutresultat och betyg baserat på prestanda

        String[][] questions = {{"Vilken är Sveriges huvudstad?", "Stockholm"},{"Vilken planet ligger närmast solen?", "Merkurius"},
                {"Vilket grundämne har den kemiska beteckningen O?","Syre"},{"Vem skrev böckerna om Pippi Långstrump?","Astrid Lindgren"},
                {"Hur många sidor har en hexagon?","Sex"}};
        String[][] answerOptions = {{"Göteborg", "Stockholm", "Malmö", "Uppsala"}, {"Venus", "Mars", "Merkurius", "Jupiter"},
                {"Syre","Guld","Järn","Väte"},{"Selma Lagerlöf", "Tove Jansson", "Astrid Lindgren", "August Strindberg"},
                {"Fem", "Sju", "Åtta", "Sex"},
                };
        char[] optionLetters = {'A','B','C','D'};
            // Array för att spara ifall användaren har:
                    // -1: ej svarat på frågan. 0: svarat fel. 1: svarat rätt.
        int[] score = {-1, -1, -1, -1, -1};
        int finalScore = 0;

        boolean continueGame = true;
        Scanner sc = new Scanner(System.in);

        while (continueGame){
            if (!IntStream.of(score).anyMatch(x -> x == -1)){
                System.out.println("Du har svarat på alla frågor! Spelet avslutas.");
                continueGame =  false;
                System.out.println("Slutresultat: " + finalScore + "/" + score.length + "." );
                if (finalScore >= 4) {
                    System.out.println("Betyg: Väl godkänd");
                } else if (finalScore >= 3) {
                    System.out.println("Betyg: Godkänd");
                } else {
                    System.out.println("Betyg: Underkänd");
                }
            } else{
                System.out.println("Välj en fråga (1-" + questions.length +"): ");
                if (sc.hasNextInt()){
                    int userChoice = sc.nextInt();
                    sc.nextLine();
                    if (userChoice <= 0 || userChoice > questions.length){
                        System.out.println("Ogiltigt värde, försök igen: ");
                    } else if (score[userChoice-1] != -1){
                        System.out.println("Du har redan svarat på den här frågan");
                        // Skriver vad användaren har (+ej) svarat på + resultat
                        for (int i = 0; i < score.length; i++){
                            if (score[i] == -1){
                                System.out.println("Fråga " + (i + 1) + " är ej besvarad.");
                            } else if (score[i] == 0){
                                System.out.println("Fråga " + (i + 1) + " är fel besvarad.");
                            } else {
                                System.out.println("Fråga " + (i + 1) + " är rätt besvarad.");
                            }
                        }
                    } else{
                        System.out.println("Frågan är: \n" + questions[userChoice-1][0] + "\n");
                        System.out.println("Välj ett svar:");
                        for (int i = 0; i < answerOptions[userChoice - 1].length; i++){
                            System.out.println(optionLetters[i] + ". " + answerOptions[userChoice-1][i] +".");
                        }
                        System.out.println("Skriv ditt svar: ");
                        String userAnswer = sc.nextLine().trim().toLowerCase();
                        int userAnswerAsNum = -1;

                        switch (userAnswer){
                            case "a" -> userAnswerAsNum = 0;
                            case "b" -> userAnswerAsNum = 1;
                            case "c" -> userAnswerAsNum = 2;
                            case "d" -> userAnswerAsNum = 3;
                        }
                        if (userAnswerAsNum == -1) {
                            System.out.println("Ogiltigt svar. Ange A, B, C eller D.");
                            continue;
                        }
                        if (answerOptions[userChoice-1][userAnswerAsNum].equalsIgnoreCase(questions[userChoice-1][1])){
                            System.out.println(answerOptions[userChoice-1][userAnswerAsNum] + " är korrekt svar.");
                            score[userChoice-1] = 1;
                            finalScore++;
                        } else {
                            System.out.println(answerOptions[userChoice-1][userAnswerAsNum] + " är fel svar.");
                            System.out.println("Rätt svar: " + questions[userChoice - 1][1]);
                            score[userChoice-1] = 0;
                        }

                    }
                } else {
                    System.out.println("Ange ett heltal mellan 1 och " + questions.length + ".");
                    sc.nextLine(); // Läs bort den ogiltiga inmatningen
                }

            }

        }

    }
}
