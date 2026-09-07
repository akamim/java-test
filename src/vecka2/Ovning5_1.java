package vecka2;

public class Ovning5_1 {
    static void main(String[] args) {
        // Skapa ett program som:
    // 1. Räknar från 1 till 10

        for (int i = 0; i < 10; i++){
            //System.out.println(i+1);
        }
        // 2. Räknar från 10 till 1

        for (int i = 10; i > 0; i--){
            //System.out.println(i);
        }

        // 3. Räknar alla jämna tal från 2 till 20
        for (int i = 2; i < 21; i=i+2){
            System.out.println(i);
        }
        // 4. Summerar alla tal från 1 till 100
        int sum = 0;
        for (int i = 0; i < 101; i++){
            sum = sum +i;
        }
        System.out.println(sum);
    }
}
