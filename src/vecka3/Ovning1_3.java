package vecka3;

public class Ovning1_3 {

    static void main(String[] args) {

        // Övning 1.3: Första returvärdet
        // Skapa metoder som returnerar värden:
        // 1. getName() - returnerar ditt namn som String
        // 2. getAge() - returnerar din ålder som int
        // 3. getFullPresentation() - returnerar en komplett presentation
        // 4. I main: använd alla metoder och skriv ut resultaten

        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getFullPresentation());
    }
    public static String getName() {
        return "Akam";
    }

    public static int getAge() {
        return 30;
    }

    public static String getFullPresentation(){
        return "Ditt namn är " + getName() + " och du är " + getAge() + " år gammal.";
    }
}
