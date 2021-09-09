import java.util.Arrays;
import java.util.List;

import com.parser.exercise.Marker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExerciseTwo {
  /**
   * Exercise 2
   *
   * Business Requirement:
   *
   * In our labs we often work with liquid transfers of special DNA tags called Markers. As this happens,
   * we may need to keep track of volumes and be sure not to mess with mixing concentrations.
   *
   * Exercise Requirement:
   *
   * 1) Add the volumes for markers with same concentration.
   *
   * 2) Get a list of markers with total volume, concentration
   *
   * Desired Output:
   *
   * Marker 1, 45, 4
   * Marker 2, 70, 5
   * Marker 3, 20, 6
   *
   */
  @Test
  public void testMarker()
  {
    // We start with an initialized List of Markers.
    List<Marker> markers =
      Arrays.asList(
        new Marker("Marker1", 20,4),
        new Marker("Marker1", 25,4),
        new Marker("Marker2", 40,5),
        new Marker("Marker2",30,5),
        new Marker("Marker3", 20,6));


  }
}
