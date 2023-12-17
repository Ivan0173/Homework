package Main.homework6.Task6_2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DividingTheTextIntoWords {
    public static void main(String[] args){
        System.out.println(divideTheTextIntoWords(""));
    }
    static String divideTheTextIntoWords(String inputText){
        String outputText= Stream.of(inputText.split("[^(а-яА-Яa-zA-Z)]"))
                .filter(e->e.length()>3)
                .map(e->e.toUpperCase())
                .sorted()
                .collect(Collectors.joining(" "));;
        return outputText;
    }
}
