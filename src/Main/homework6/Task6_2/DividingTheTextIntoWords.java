package homework6.Task6_2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DividingTheTextIntoWords {

    static String divideTheTextIntoWords(String inputText){
        String outputText= Stream.of(inputText.split("[^(а-яА-Яa-zA-Z)]"))
                .filter(e->e.length()>2)
                .map(e->e.toUpperCase())
                .distinct()
                .sorted()
                .collect(Collectors.joining(" "));;
        return outputText;
    }
}
