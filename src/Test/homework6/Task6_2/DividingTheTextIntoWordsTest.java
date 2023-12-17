package homework6.Task6_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividingTheTextIntoWordsTest {

    @Test
    void divideTheTextIntoWords() {
        assertEquals("", DividingTheTextIntoWords.divideTheTextIntoWords(""));
        String expectedString = "";
        String resultString = DividingTheTextIntoWords.divideTheTextIntoWords("Да; и; но ((4))");
        assertEquals(true,expectedString.equals(resultString));

        expectedString = "ДЕНЬ ДОБРЫЙ";
        resultString = DividingTheTextIntoWords.divideTheTextIntoWords("Добрый день!");
        assertEquals(true,expectedString.equals(resultString));

        expectedString = "ЗЕЛЕНЫЙ СИНЕ";
        resultString = DividingTheTextIntoWords.divideTheTextIntoWords("сине-зеленый");
        assertEquals(true,expectedString.equals(resultString));

        expectedString = "БЕЗ КОФЕ МОЛОКОМ САХАРА ЧАШКА";
        resultString = DividingTheTextIntoWords.divideTheTextIntoWords("Чашка кофе с молоком без сахара.");
        assertEquals(true,expectedString.equals(resultString));

        expectedString = "ЕЩЕ МНОГО РАЗ";
        resultString = DividingTheTextIntoWords.divideTheTextIntoWords("Эх раз, да еще раз, да еще много-много раз!");
        assertEquals(true,expectedString.equals(resultString));

        expectedString= "ADIPISCING ALIQUA ALIQUIP AMET " +
                "ANIM AUTE CILLUM COMMODO " +
                "CONSECTETUR CONSEQUAT CULPA " +
                "CUPIDATAT DESERUNT DOLOR DOLORE " +
                "DUIS EIUSMOD ELIT ENIM ESSE EST " +
                "EXCEPTEUR EXERCITATION FUGIAT " +
                "INCIDIDUNT IPSUM IRURE LABORE " +
                "LABORIS LABORUM LOREM MAGNA " +
                "MINIM MOLLIT NISI NON NOSTRUD " +
                "NULLA OCCAECAT OFFICIA PARIATUR " +
                "PROIDENT QUI QUIS REPREHENDERIT " +
                "SED SINT SIT SUNT TEMPOR ULLAMCO " +
                "VELIT VENIAM VOLUPTATE";
        resultString = DividingTheTextIntoWords.divideTheTextIntoWords("Lorem ipsum dolor sit amet, consectetur\n" +
                "adipiscing elit, sed do eiusmod tempor\n" +
                "incididunt ut labore et dolore magna aliqua. Ut\n" +
                "enim ad minim veniam, quis nostrud exercitation \n" +
                "ullamco laboris nisi ut aliquip ex ea commodo\n" +
                "consequat. Duis aute irure dolor in reprehenderit\n" +
                "in voluptate velit esse cillum dolore eu fugiat\n" +
                "nulla pariatur. Excepteur sint occaecat cupidatat\n" +
                "non proident, sunt in culpa qui officia deserunt\n" +
                "mollit anim id est laborum.");
        assertEquals(true,expectedString.equals(resultString));
    }
}