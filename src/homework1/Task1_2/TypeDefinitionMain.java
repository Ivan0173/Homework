package homework1.Task1_2;

import java.util.Scanner;

public class TypeDefinitionMain {
    public static void main(String[] args) {
        System.out.println("Type Definition");
        var scanner = new Scanner(System.in);
        System.out.println(typeDefinition(scanner));
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
}
