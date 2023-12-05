package homework1.Task1_1;
public class RoundingNumbersMain {
    public static void main(String[] args) {
        System.out.println("Rounding Numbers");
        roundingNumbers(new double[]{30.0, 10000.1, 12.5, 99.99, 0.0, -23.45, -4.5, -129.675});
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
}
