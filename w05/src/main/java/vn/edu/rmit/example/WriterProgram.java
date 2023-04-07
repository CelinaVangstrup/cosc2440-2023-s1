package vn.edu.rmit.example;

import java.io.FileWriter;
import java.io.IOException;

public class WriterProgram {
  public static void main(String[] args) {
    try {
      FileWriter fWriter = new FileWriter("output.txt");
      // write a message
      fWriter.write("Hello, World!\n");
      // write some special characters
      fWriter.write("\n");
      fWriter.write("There are some special tabs \t\t\t\n");
      fWriter.write("This is a long line\n");
      fWriter.write("Short\n");
      fWriter.flush();
      fWriter.close();
      System.out.println("Finish!");
    } catch (IOException ioex) {
      // do nothing
    }
  }
}
