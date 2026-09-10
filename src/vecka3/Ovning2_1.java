package vecka3;

public class Ovning2_1 {
    static void main(String[] args) {
        // Övning 2.1: Grundläggande matematik
        // Skapa metoder för:
        // 1. add(int a, int b) - returnerar summan
        // 2. subtract(int a, int b) - returnerar differensen
        // 3. multiply(int a, int b) - returnerar produkten
        // 4. divide(double a, double b) - returnerar kvoten
        // 5. I main: testa alla metoder med olika tal
        System.out.println("1 + 1 = " + add(1, 1));
        System.out.println("2 - 1 = " + subtract(2, 1));
        System.out.println("2 x 2 = " + multiply(2, 2));
        System.out.println("4 ÷ 2 = " + divide(4, 2));
    }
    public static int add(int a, int b){
        return a + b;
    }
    public static int subtract(int a, int b){
        return a - b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public static double divide(double a, double b){
        return a/b;
    }
}
