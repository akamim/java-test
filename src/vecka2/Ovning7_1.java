package vecka2;

public class Ovning7_1 {
    static void main(String[] args) {
        //Favorittal
        // 1. Skapar en array med dina 5 favorittal
        int[] favNumbers = {4, 7, 12, 18, 25};

        // 2. Skriver ut alla tal
        for (int number : favNumbers) {
            System.out.println(number);
        }

        // 3. Räknar ut summan av alla tal
        int sum = 0;
        for (int number : favNumbers){
            sum += number;
        }
        System.out.println("Summa: " + sum);


        // 4. Hittar det största talet
        int max = favNumbers[0];
        for (int i = 1; i < favNumbers.length; i++){
            if (max < favNumbers[i]){
                max = favNumbers[i];
            }
        }
        System.out.println("Största talet: " + max);

        // 5. Hittar det minsta talet
        int min = favNumbers[0];
        for (int i = 1; i < (favNumbers.length); i++){
            if (min > favNumbers[i]){
                min = favNumbers[i];
            }
        }
        System.out.println("Minsta talet: " + min);

        System.out.printf("Medelvärde: %.2f%n", averageOfNum(favNumbers));

    }
    public  static double  averageOfNum(int[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        return sum/ array.length;
    }
}
