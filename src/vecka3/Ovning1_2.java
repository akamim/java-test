package vecka3;

public class Ovning1_2 {
    static void main(String[] args) {

        // Övning 1.2: Metoder med parametrar
        // Skapa metoder för:
        // 1. printName(String name) - skriver ut "Ditt namn är: [name]"
        // 2. printAge(int age) - skriver ut "Du är [age] år gammal"
        // 3. printGreeting(String name, int age) - kombinerar ovan
        // 4. I main: anropa alla tre metoder med olika värden

        printGreeting("Anna", 25);
        printGreeting("Linus", 30);
    }
    public static void printName(String name){
        System.out.println("Ditt namn är: " + name);
    }

    public static void printAge(int age){
        System.out.println("Du är " + age + " år gammal");
    }

    public static void printGreeting(String name, int age){
        printName(name);
        printAge(age);
    }
}
