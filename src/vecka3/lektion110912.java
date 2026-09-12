package vecka3;

import java.util.Scanner;

public class lektion110912 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hur många poäng vill du mata in? ");

        int numOfScores = sc.nextInt();

        int[] scores = new int[numOfScores];

        for(int index = 0; index < scores.length; index++){
            System.out.println("Skriv poäng " + (index + 1) + ": ");
            scores[index] = sc.nextInt();
        }

        printNumber(scores);

        int sum = calculateSum(scores);
        System.out.println("Summan är " + sum);

        double average = average(sum, scores.length);
        System.out.println("Medelvärdet är " + average);

        int largestNumber = findLargest(scores);
        int smallestNumber = findSmallest(scores);

        System.out.println("Största värdet: " + largestNumber);
        System.out.println("Minsta värdet: " + smallestNumber);


    }
    public static void printNumber(int[] values){
        System.out.println("--- Poäng ---");
        for (int i = 0; i < values.length; i++){
            System.out.println("Poäng " + (i + 1) + ": " + values[i]);
        }
    }
    public static int calculateSum(int[] values){
        int sum = 0;
        for (int i = 0; i < values.length; i++){
            sum += values[i];
        }
        return sum;
    }

    public static double average(int sum, int numberOfValues){
        return (double) sum /numberOfValues;
    }

    public static int findLargest(int[] values){
        int largest = values[0];
        for(int i = 0; i < values.length; i++){
            if(values[i] > largest){
                largest = values[i];
            }
        }
        return largest;
    }

    public static int findSmallest(int[] values){
        int smallest = values[0];
        for(int i = 0; i < values.length; i++){
            if(values[i] < smallest){
                smallest = values[i];
            }
        }
        return smallest;
    }

}
