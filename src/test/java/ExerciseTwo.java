import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExerciseTwo {

  public class Marker {
    private String markerName;
    private double additionalVolumeRequired;
    private double concentration;
    public String getMarkerName() {
      return markerName;
    }
    public void setMarkerName(String markerName) {
      this.markerName = markerName;
    }
    public double getConcentration() {
      return concentration;
    }
    public void setConcentration(double concentration) {
      this.concentration = concentration;
    }
    public Marker(String markerName, double additionalVolumeRequired, double concentration){
      this.markerName = markerName;
      this.additionalVolumeRequired = additionalVolumeRequired;
      this.concentration = concentration;
    }
    public double getAdditionalVolumeRequired(){
      return this.additionalVolumeRequired;
    }
  }

  /**
   * Exercise 2
   *
   * You will see definitions for several markers
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
    List<Marker> markers =
      Arrays.asList(
        new Marker("Marker1", 20,4),
        new Marker("Marker1", 25,4),
        new Marker("Marker2", 40,5),
        new Marker("Marker2",30,5),
        new Marker("Marker3", 20,6));


  }
}
