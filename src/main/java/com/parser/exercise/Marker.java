package com.parser.exercise;

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
