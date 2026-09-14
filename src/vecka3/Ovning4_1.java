package vecka3;

public class Ovning4_1 {
    static void main(String[] args) {

        // Övning 4.1: Array-statistik
        // Skapa metoder för:
        // 1. findMax(int[] numbers) - hittar största värdet
        // 2. findMin(int[] numbers) - hittar minsta värdet
        // 3. calculateSum(int[] numbers) - summerar alla värden
        // 4. calculateAverage(int[] numbers) - beräknar genomsnitt
        // 5. I main: testa med olika arrays
        int[] numbers = {7, 31, 78, 12, 101, 95};

        System.out.println("Största värder i Arrayen: " + findMax(numbers));
        System.out.println("Minsta värder i Arrayen: " + findMin(numbers));
        System.out.println("Summering av alla värden: " + calculateSum(numbers));
        System.out.println("Genomsnitta av värden: " + calculateAverage(numbers));

    }

    public static int findMax(int[] numbers){
        int highestNumber = numbers[0];
        for (int number : numbers){
            if (number > highestNumber){
                highestNumber = number;
            }
        }
        return highestNumber;
    }

    public static int findMin(int[] numbers){
        int smallestNumber = numbers[0];
        for (int number : numbers){
            if (number < smallestNumber){
                smallestNumber = number;
            }
        }
        return smallestNumber;
    }

    public static int calculateSum(int[] numbers){
        int sumOfNumbers = 0;
        for (int number : numbers){
            sumOfNumbers += number;
        }
        return sumOfNumbers;
    }

    public static double calculateAverage(int[] numbers){
        return (double) calculateSum(numbers)/numbers.length;
    }
}
