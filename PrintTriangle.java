package assignment;

import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();
        System.out.println(printTriangle(number));
    }

    public static String printTriangle(int num) {
        /* Using string builder coz string will take more extra space in spring pool area
         To avoid this I used string builder, and it has some handy method so that
         we can use it */
        StringBuilder result = new StringBuilder();

        // This is outer loop
        for (int i = 1; i <= num; i++) {
            // appending starting spaces
            result.append("  ".repeat(num - i));
            // appending *
            result.append(" *  ".repeat(i));
            // line separator
            result.append(System.lineSeparator());
        }
        return result.toString();
    }
}
