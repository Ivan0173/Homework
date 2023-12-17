package Main.homework1.Task1_4;

import java.util.Scanner;

public class MaximumSignSequenceMain {
    public static void main(String[] args) {
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
