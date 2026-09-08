package vecka2;


import java.util.Scanner;

public class ProgramC {
    static void main(String[] args) {
        //Program C: Personlig budget-kalkylator
        // Bygg en budget-kalkylator som:
        // 1. Frågar efter månadsinkomst
        System.out.println("Vad är din månadsinkomst?");
        Scanner sc = new Scanner(System.in);
        int salary = 0;
        while (salary <= 0){
            salary = sc.nextInt();
            sc.nextLine();
            if (salary <= 0){
                System.out.println("Ogiltigt värde, försök igen: ");
            }
        }


        // 2. Låter användaren mata in olika utgifter (hyra, mat, transport, etc.)
        String[] typeOfExpenses = {"Boende", "Mat", "Transport", "Abonnemang", "Nöje/Shopping", "Övrigt"};
        int[] userExpensesPerType = new int[typeOfExpenses.length];

        for (int i = 0; i < typeOfExpenses.length; i++){
            System.out.println("Hur mycket spenderar du på " + typeOfExpenses[i] + "?");
            userExpensesPerType[i] = sc.nextInt();
        }

        // 3. Räknar ut totala utgifter
        int sumOfExpenses = 0;
        for (int i = 0; i < typeOfExpenses.length; i++){
            sumOfExpenses += userExpensesPerType[i];
        }
        if (sumOfExpenses > 0){
            System.out.println("Totala utgifter: " + sumOfExpenses + "kr.");
        }


        // 4. Visar hur mycket som blir över
        int salaryMinusExpenses = salary - sumOfExpenses;
        System.out.println("Så här mycket blir över från din månadsinkomst: " + salaryMinusExpenses + "kr.");

        // 5. Ger råd baserat på ekonomisk situation
        double salaryLeftPercent =  ((double) salaryMinusExpenses /salary) * 100;
        if (salaryLeftPercent >= 40){
            System.out.printf("Bra ekonomi! Du har %.1f procent av din månadsinkomst kvar.", salaryLeftPercent);
        } else if (salaryLeftPercent >= 20) {
            System.out.printf("Fungerande ekonomi. Du har %.1f procent av din månadsinkomst kvar, överväg att spendera mindre.", salaryLeftPercent);
        } else {
            System.out.printf("Din privatekonomi behöver förbättras. Du har %.1f procent av din månadsinkomst kvar.", salaryLeftPercent);
        }
        // 6. Visar procentuell fördelning av utgifter
        for (int i = 0; i < typeOfExpenses.length; i++){
            double percentPerType = ((double) (userExpensesPerType[i])/sumOfExpenses) * 100;
            System.out.println(typeOfExpenses[i] + " är " + percentPerType + " procent av dina utgifter.");
        }
    }
}
