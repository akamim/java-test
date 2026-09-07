package vecka2;

public class lektion040926 {
    static void main(String[] args) {
        String[] studenNamnes = {"Anna", "Leo", "Sara"};
        greetStudent(studenNamnes);

    }


    public static void printCourseInfo(){
        System.out.println("Course information: SYTEST26");
    }
    public static void greetStudent(String[] names){
        for (int index = 0; index < names.length; index++){
            System.out.println("Hej " + names[index] + "!");
        }

    }
    public static int calcualteTotal(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
}
