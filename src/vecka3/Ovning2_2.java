package vecka3;

import java.util.Scanner;

public class Ovning2_2 {
    static void main(String[] args) {

        // Övning 2.2: Geometriska beräkningar
        // Skapa metoder för:
        // 1. calculateCircleArea(double radius) - returnerar cirkelns area
        // 2. calculateRectangleArea(double length, double width) - rektangelns area
        // 3. calculateTriangleArea(double base, double height) - triangelns area
        // 4. I main: skapa en "area-kalkylator" som använder alla metoder
        Scanner sc = new Scanner(System.in);
        int userChoice = 0;

        while (userChoice != 4){
            System.out.println("__ Area-kalkylator __");
            System.out.println("Välj ett alternativ: ");
            menu();
            userChoice = sc.nextInt();
            sc.nextLine();
            switch (userChoice){
                case 1 -> {
                    System.out.println("Vad är cirkelns radie?");
                    double radius = sc.nextDouble();
                    System.out.println("Cirkelns area = " + calculateCircleArea(radius));
                }
                case 2 -> {
                    System.out.println("Skriv rektangelns längd: ");
                    double length = sc.nextDouble();
                    System.out.println("Skriv rektangelns bredd: ");
                    double width = sc.nextDouble();
                    System.out.println("Rektangelns area = " + calculateRectangleArea(length, width));
                }
                case 3 -> {
                    System.out.println("Skriv triangelns bas: ");
                    double base = sc.nextDouble();
                    System.out.println("Skriv triangelns höjd: ");
                    double height = sc.nextDouble();
                    System.out.println("Triangelns area = " + calculateTriangleArea(base, height));
                }
            }
        }

    }
    public static void menu(){
        System.out.println("1. Beräkna cirkelns area");
        System.out.println("2. Beräkna rektangelns area");
        System.out.println("3. Beräkna triangelns area");
        System.out.println("4. Avsluta programmet");
    }
    public static double calculateCircleArea(double radius){
        return 3.1416 * radius * radius;
    }

    public static double calculateRectangleArea(double length, double width){
        return length * width;
    }

    public static double calculateTriangleArea(double base, double height){
        return 0.5 * base * height;
    }

}
