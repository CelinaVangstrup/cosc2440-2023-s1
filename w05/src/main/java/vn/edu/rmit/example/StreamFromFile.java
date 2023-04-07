package vn.edu.rmit.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StreamFromFile {
  public static void main(String[] args) {
    // display the length of each line of a file

    // must be final to use in lamda
    final int[] start = new int[] {1};
    try {
      Files.lines(Paths.get("output.txt"))
        .filter(l -> l.length() > 5)
        .map(line -> line.length())
        .forEach(
          c -> {
            System.out.println("Line #" + start[0] + " length: " + c);
            start[0]++;
          });
    } catch (IOException ioex) {
      // do nothing
    }      
  }
}
