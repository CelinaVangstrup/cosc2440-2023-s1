package vn.edu.rmit.example;

import java.io.FileInputStream;
import java.io.IOException;

public class InputProgram {
  public static void main(String[] args) {
    FileInputStream iStream;
    try {
      iStream = new FileInputStream("output.bin");
      int result = -1;
      while ((result = iStream.read()) != -1) {
        System.out.println(result);
      }
      System.out.println("Finish!");
    } catch (IOException ioex) {
      // do nothing
    }
  }
}
