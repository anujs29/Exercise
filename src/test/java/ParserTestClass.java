import com.parser.exercise.TextFileLogParser;
import org.junit.Test;
import org.springframework.util.Assert;

public class ParserTestClass {

    @Test
     public void testTextFileLogParser(){
        String logText = " Random Text " +
                "too look for   a special text ;" +
                "in a file with tabs and new line characters ";

        String searchtext = "charajcters";

        TextFileLogParser textFileLogParser = new TextFileLogParser();
        Assert.isTrue(textFileLogParser.isLogPresent(logText,searchtext), "Search text is Not Present");
    }

}
