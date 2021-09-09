import com.parser.exercise.TextFileLogParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExerciseOne {
  /**
   * Exercise 1
   *
   * Business Requirement:
   *
   * In our laboratory, we often integrate with lab instruments using machine generated log files.
   * We need to parse these log files to look for specific entity (plate/sample) names to be able to move them
   * across a workflow. These entities can have multiple statuses during the process.
   *
   * Exercise Requirement:
   *
   * Create a test case to look for an entity name from a file: log(19-Sep-19 1_22_59 PM).log
   * This file is provided in the resources folder in src/main
   *
   * 1) Determine whether the plate ID E19G05_MG0430008 shows up in this file
   *
   * 2) Parse the date and time of the first event where E19G05_MG0430008 is mentioned
   *
   * 3) Create a list of all plates that are mentioned in the file.
   */
  @Test
  public void testParserFromTextLogFile() {

  }
}
