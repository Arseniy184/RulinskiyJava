import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Сравнение двух чисел и выполнение арифметических операций
        System.out.println("Введите первое целое число (a):");
        int a = scanner.nextInt();
        System.out.println("Введите второе целое число (b):");
        int b = scanner.nextInt();

        compareAndCalculate(a, b);

        // 2. Сравнение строк
        scanner.nextLine(); // Очистка буфера после nextInt()
        System.out.println("\nВведите первую строку:");
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую строку:");
        String str2 = scanner.nextLine();

        compareStrings(str1, str2);

        // 3. Вывод четных чисел из массива
        System.out.println("\nЧетные числа из массива:");
        printEvenNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    }

    // Метод для сравнения двух чисел и выполнения операций
    private static void compareAndCalculate(int a, int b) {
        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Арифметические операции
        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));
        if (b != 0) {
            System.out.println("Деление: " + (a / b));
        } else {
            System.out.println("Деление невозможно (на 0)");
        }
    }

    // Метод для сравнения строк
    private static void compareStrings(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }

    // Метод для вывода четных чисел из массива
    private static void printEvenNumbers(int[] numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
