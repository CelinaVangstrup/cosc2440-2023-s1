package vn.edu.rmit.example.factorymethod;

public class InterestBasedMinorPicker extends MinorPicker {
  private String interest;

  public InterestBasedMinorPicker(String i) {
    interest = i;
  }

  @Override
  public Minor getMinor() {
    if (interest.toLowerCase().contains("intelligence")) {
      return new AIMinor();
    }
    if (interest.toLowerCase().contains("html")) {
      return new MWMinor();
    }
    return new DOMinor();
  }
}
