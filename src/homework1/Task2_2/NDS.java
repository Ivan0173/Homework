package homework1.Task2_2;

import java.util.Scanner;

public class NDS {
    public static void main(String[] args) {
        System.out.println("Enter the full cost of the product");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()) {
            double fullCost = scanner.nextDouble();
            if (fullCost > 0) {
                calculationCostComponents(fullCost);
            } else {
                System.out.println("The cost cannot be less than zero");
            }
        } else {
            System.out.println("It is not a number that has been reduced");
        }
    }

    static void calculationCostComponents(double fullCost) {
        System.out.println("Cost without NDS: " + Math.round(fullCost / 1.2 * 100) / 100.0);
        System.out.println("Cost NDS: " + Math.round((fullCost - fullCost / 1.2) * 100) / 100.0);
        System.out.println("Value of NDS for the tax return: " + Math.round(fullCost - fullCost / 1.2));
    }
}
