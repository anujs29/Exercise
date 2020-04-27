import com.parser.exercise.TextFileLogParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParserTestClass {

    @Test
     private void testTextFileLogParser(){
        String logText = " Random Text " +
                "too look for   a special text ;" +
                "in a file with tabs and new line characters ";

        String searchtext = "characters";

        TextFileLogParser textFileLogParser = new TextFileLogParser();
        Assertions.assertTrue(textFileLogParser.isLogPresent(logText,searchtext), "Search text is Not Present");
    }

}
