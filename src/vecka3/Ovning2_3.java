package vecka3;

public class Ovning2_3 {
    static void main(String[] args) {

        // Övning 2.3: Avancerade matematiska funktioner
        // Skapa metoder för:
        // 1. power(double base, int exponent) - beräknar base^exponent
        // 2. factorial(int n) - beräknar n! (n faktorial)
        // 3. isPrime(int number) - kontrollerar om ett tal är primtal
        // 4. fibonacci(int n) - returnerar det n:te fibonacci-talet
        // 5. I main: testa alla funktioner
        System.out.println("2^4 = " + power(2, 4));

        System.out.println("0! = " + factorial(0));

        for (int i = 0; i <= 10; i++){ // kontrollerar om tal 0-10 är primtal
            System.out.println(i + " is prime? " + isPrime(i));
        }

        System.out.println("20:e fibonacci-talet: " + fibonacci(20));

    }
    public static double power(double base, int exponent){
        return Math.pow(base, exponent);
    }

    public static int factorial(int n){
        int factorial = 1;
        for (int i = 2; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static boolean isPrime(int number){
        boolean isPrime = true;
        if(number <= 1){
            isPrime = false;
        } else{
            for(int i = 2; i < number; i++){
                if (number % i == 0){
                    isPrime = false;
                }
            }
        }
        return isPrime;
    }

    public static int fibonacci(int n){
        if (n <= 0) {
            return 0;
        } else {
            int[] fibArray = new int[n+1];
            fibArray[0] = 0;
            fibArray[1] = 1;
            for(int i = 2; i <= n; i++){
                fibArray[i] = fibArray[i - 2] + fibArray[i - 1];
            }
            return fibArray[n];
        }

    }

}
