import com.parser.exercise.TextFileLogParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParserTestClass {

    /**
     * Look for a simple 1 word text in a string
     */
    @Test
    public void testParserFromStringCharacters(){
        String logText = " Random Text " +
                "too look for   a special text ;" +
                "in a file with tabs and new line characters ";

        String searchtext = "characters";

        TextFileLogParser textFileLogParser = new TextFileLogParser();
        Assertions.assertTrue(textFileLogParser.isLogPresent(logText,searchtext), "Search text is Not Present");
    }




    /**
     *
     * Exercise 1
     *
     * Look for a simple 1 word text in a file : log(19-Sep-19 1_22_59 PM).log
     *
     * 1) Determine whether the ID E19G05_MG0430008 shows up in this file
     *
     * 2) Parse the date and time of the first event where E19G05_MG0430008 is mentioned
     *
     */
    @Test
    public void testParserFromTextLogFile() {

    }


}
