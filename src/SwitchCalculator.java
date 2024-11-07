import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        double number1;
        double number2;
        String operator;
        double Result = 0;
        boolean nextCalculation = true;

        Scanner input = new Scanner(System.in);

        while (nextCalculation) {

            System.out.println("**********\n");

            System.out.println("Write first number: ");
            number1 = input.nextDouble();

            System.out.println("Chose a operator between +, - , / and *: ");
            operator = input.next();

            System.out.println("Write second number: ");
            number2 = input.nextDouble();

            //Switch
            switch (operator){
                case "+" : Result = number1 + number2; break;
                case "-" : Result = number1 - number2; break;
                case "/" : Result = number1 / number2; break;
                case "*" : Result = number1 * number2; break;
                default:
                    System.out.println("Error: Input is not correct!");
            }
            if (operator.equals("+") || operator.equals("-") || operator.equals("/") || operator.equals("*")){
                System.out.println("**********\nResult -> " + number1 + operator + number2 + " = " + Result);

                System.out.println("Do you like to continue? (No => false | Yes => true)");
                nextCalculation = input.nextBoolean();
            }
            if (!nextCalculation) {
                System.out.println("Tank you for using our calculator!");
            }
        }
    }
}