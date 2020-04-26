import com.parser.exercise.TextFileLogParser;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.springframework.util.Assert;
import org.springframework.beans.factory.annotation.Autowired;

@RunWith(JUnitPlatform.class)
public class ParserTestClass {

    @Test
     private void testTextFileLogParser(){
        String logText = " Random Text " +
                "too look for   a special text ;" +
                "in a file with tabs and new line characters ";

        String searchtext = "charajcters";

        TextFileLogParser textFileLogParser = new TextFileLogParser();
        Assert.isTrue(textFileLogParser.isLogPresent(logText,searchtext), "Search text is Not Present");
    }

}
