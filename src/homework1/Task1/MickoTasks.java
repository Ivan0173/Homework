package homework1.Task1;

import java.util.Random;
import java.util.Scanner;

public class MickoTasks {
    public static void main(String[] args) {
//        System.out.println("Rounding Numbers");
//        roundingNumbers(new double[]{30.0, 10000.1, 12.5, 99.99, 0.0, -23.45, -4.5, -129.675});
        
//        System.out.println("Type Definition");
//        var scanner = new Scanner(System.in);
//        System.out.println(typeDefinition(scanner));

//        System.out.println("Reading and analyzing numbers");
//        var scanner = new Scanner(System.in);
//        ReadingAndAnalyzingNumbers(scanner);

        System.out.println("Maximum sign sequence");
        System.out.println("Enter the number of generation numbers:");
        var scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number > 0) {
                System.out.println("MaxLength: " + maximumSignSequence(number));
            }
        } else {
            System.out.println("Error input");
        }

    }

    static void roundingNumbers(double[] arrayDouble) {
        System.out.format("%-14s%-10s%-10s%-10s%n", "Input number", "round", "floor", "ceil");
        for (double number : arrayDouble) {
            int numberRound = (int) Math.round(number);
            int numberFloor = (int) Math.floor(number);
            int numberCeil = (int) Math.ceil(number);
            System.out.format("%-14s%-10d%-10d%-10d%n", number, numberRound, numberFloor, numberCeil);
        }
    }

    static String typeDefinition(Scanner scanner) {
        if (scanner.hasNextLong()) {
            return "Integer";
        } else if (scanner.hasNextDouble()) {
            return "Real number";
        } else if (scanner.hasNextBoolean()) {
            return "Logical";
        } else {
            return "Text";
        }
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

    static int maximumSignSequence(int n) {
        int maxLength = 0;
        int counter = 1;
        int number = (int) (Math.random() * 2000 - 1000);
        System.out.println(number + "    " + counter);
        for (int i = 0; i < n - 1; i++) {
            int number1 = (int) (Math.random() * 2000 - 1000);
            if (number1 * number > 0 && number != 0) {
                counter++;
            } else if (number1 == 0 && number == 0) {
                counter++;
            } else {
                if (counter > maxLength) {
                    maxLength = counter;
                }
                counter = 1;
            }
            number = number1;
            System.out.println(number1 + "    " + counter);
        }
        return maxLength;
    }
}
