import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // 1. Comparing two integers and performing arithmetic operations
        System.out.println("Enter the first integer (a):");
        int a = scanner.nextInt();  // Read the first integer
        System.out.println("Enter the second integer (b):");
        int b = scanner.nextInt();  // Read the second integer

        // Call method to compare the numbers and perform arithmetic operations
        compareAndCalculate(a, b);

        // 2. Comparing two strings
        scanner.nextLine(); // Clear the buffer after nextInt()
        System.out.println("\nEnter the first string:");
        String str1 = scanner.nextLine();  // Read the first string
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();  // Read the second string

        // Call method to compare the strings
        compareStrings(str1, str2);

        // 3. Print even numbers from the array
        System.out.println("\nEven numbers from the array:");
        printEvenNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    }

    // Method to compare two integers and perform arithmetic operations
    private static void compareAndCalculate(int a, int b) {
        // Compare the integers
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Arithmetic operations
        System.out.println("Addition: " + (a + b));  // Print the result of addition
        System.out.println("Subtraction: " + (a - b));  // Print the result of subtraction
        System.out.println("Multiplication: " + (a * b));  // Print the result of multiplication
        if (b != 0) {
            System.out.println("Division: " + (a / b));  // Print the result of division (if b is not 0)
        } else {
            System.out.println("Division is not possible (division by 0)");
        }
    }

    // Method to compare two strings
    private static void compareStrings(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("The strings are identical");
        } else {
            System.out.println("The strings are not identical");
        }
    }

    // Method to print even numbers from an array
    private static void printEvenNumbers(int[] numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);  // Print the number if it's even
            }
        }
    }
}
