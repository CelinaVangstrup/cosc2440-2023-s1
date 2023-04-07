package vn.edu.rmit.example;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReaderProgram {
  public static void main(String[] args) {
    try {
      BufferedReader bReader = new BufferedReader(new FileReader("output.txt"));
      String line;
      while ((line = bReader.readLine()) != null) {
        System.out.println(line);
      }
      bReader.close();
    } catch (IOException ioex) {
      // do nothing
    }
  }
}
