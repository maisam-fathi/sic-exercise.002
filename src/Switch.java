import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String grade;
        int i = 0;
        while (i !=5) {
            System.out.print("Enter grade between A and C: ");
            grade = scanner.next();
            switch (grade) {
                case "A":
                    System.out.println("Great job!");
                    break;
                case "B":
                    System.out.println("Good job!");
                    break;
                case "C":
                    System.out.println("You can do better!");
                    break;
                default:
                    System.out.println("Ouch!");
            }
            i++;
        }
    }
}
