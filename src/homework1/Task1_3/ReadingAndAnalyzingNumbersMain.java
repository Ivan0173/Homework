package homework1.Task1_3;

import java.util.Scanner;

public class ReadingAndAnalyzingNumbersMain {
    public static void main(String[] args) {
        System.out.println("Reading and analyzing numbers");
        var scanner = new Scanner(System.in);
        ReadingAndAnalyzingNumbers(scanner);
    }
    /**
     * Это метод читает числа пока пользователь их вводит
     * И выводит в консоль их количество, максимальное, минимальное и средне значение.
     *
     * @param scanner
     */
    static void ReadingAndAnalyzingNumbers(Scanner scanner) {
        int counter = 0;
        double maxValue = Double.MIN_VALUE;
        double minValue = Double.MAX_VALUE;
        double sumNumber = 0;
        String inputString = scanner.nextLine();
        boolean isNumber = true;
        while (!inputString.isEmpty() && isNumber) {
            try {
                double number = Double.parseDouble(inputString);
                if (number > maxValue) {
                    maxValue = number;
                }
                if (minValue > number) {
                    minValue = number;
                }
                sumNumber += number;
                counter++;
                inputString = scanner.nextLine();
            } catch (Exception e) {
                isNumber = false;
            }
        }
        System.out.println("Quantity numbers: " + counter);
        System.out.println("Max number: " + maxValue);
        System.out.println("Min number: " + minValue);
        System.out.println("Average value: " + (double) (sumNumber / counter));
    }
}
