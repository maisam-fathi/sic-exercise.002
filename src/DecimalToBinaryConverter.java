/*
Task: Convert decimal to binary:
Write a program that converts a given decimal number to a binary number. The program should accept a decimal number as
input and return the corresponding binary number as output. Use loops and/or recursion to perform the conversion.

Requirements:
1. The program should accept an integer decimal number as input.
2. The output should be the corresponding binary number as a string.
3. Do not use built-in methods for direct conversion (such as `Integer.toBinaryString()` in Java), but implement the
conversion logic yourself.
4. Print a message if the input is invalid (for example, not an integer).
5. The program should accept a list of decimal numbers and return the corresponding binary number for each number.

Example:
Input: Decimal: 10
Output: Binary: 1010
Input: Decimal: 255
Output: Binary: 11111111
List of decimal numbers to convert:
Use your program to convert the following decimal numbers to binary:
5, 8, 12, 15, 18, 23, 32, 45, 57, 63, 72, 85, 90, 100, 128, 150, 200, 255, 300, 512, 0, -1, -16, -250, -255

Note:
The binary representation of a decimal number can be found by repeatedly dividing the number by 2. Make note of the
remainder of each division and read the result from bottom to top.
 */

import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        StringBuilder reverseBinary = new StringBuilder();

        String negativeChecker = "+";
        if (decimalNumber < 0){
        negativeChecker = "-";
        decimalNumber = decimalNumber * -1;
        }

        while (decimalNumber > 0) {

            int operator = decimalNumber % 2;

            if (operator == 0) {
                reverseBinary.append("0");
            } else {
                reverseBinary.append("1");
            }
            decimalNumber /= 2;
        }
        System.out.println("The Binary number without Mirror: " + reverseBinary);

        //Start to mirror the number
        String[] binary = reverseBinary.toString().split("");

        System.out.println("Binary with 3 digits: " +  binary[2] + binary[1] + binary[0]);

        //reverse all binary number with for loop
        int n = binary.length;
        for (int i = 0; i < n / 2; i++){
            int splitBinary = Integer.parseInt(binary[i]);
            binary[i] = binary[n - i - 1];
            binary[n - i - 1] = String.valueOf(splitBinary);
        }

        if (negativeChecker.equals("-")){
            System.out.print("-");
        }

        for ( String resultBinary : binary) {
            System.out.print(resultBinary);
        }
    }
}