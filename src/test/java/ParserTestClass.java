import com.parser.exercise.TextFileLogParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParserTestClass {

    /**
     * Look for a simple 1 word text in a string
     */
    @Test
    private void testParserFromStringCharacters(){
        String logText = " Random Text " +
                "too look for   a special text ;" +
                "in a file with tabs and new line characters ";

        String searchtext = "characters";

        TextFileLogParser textFileLogParser = new TextFileLogParser();
        Assertions.assertTrue(textFileLogParser.isLogPresent(logText,searchtext), "Search text is Not Present");
    }




    /**
     * Look for a simple 1 word text in a file : log(19-Sep-19 1_22_59 PM).log
     * Also parse the date and time of the event
     */
    @Test
    private void testParserFromTextLogFile() {

    }






}
