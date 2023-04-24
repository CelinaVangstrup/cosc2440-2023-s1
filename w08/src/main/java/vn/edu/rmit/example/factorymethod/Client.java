package vn.edu.rmit.example.factorymethod;

public class Client {
  public static void main(String[] args) {
    MinorPicker picker = new InterestBasedMinorPicker("I love HTML");
    Minor minor = picker.getMinor();
    System.out.printf("I will choose %s\n", minor);
  }  
}
