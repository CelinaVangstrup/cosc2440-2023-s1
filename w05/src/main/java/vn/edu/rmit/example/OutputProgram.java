package vn.edu.rmit.example;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputProgram {
  public static void main(String[] args) {
    try {
      FileOutputStream oStream = new FileOutputStream("output.bin");
      // use a binary viewer to view the file content
      // write four bytes, all are zeros
      oStream.write(0);
      oStream.write(256);
      oStream.write(512);
      oStream.write(1024);
      // write four bytes, all are ones
      oStream.write(255);
      oStream.write(512 - 1);
      oStream.write(1024 - 1);
      oStream.write(2048 - 1);
      // force write
      oStream.flush();
      oStream.close();
      System.out.println("Finish!");
    } catch (IOException ioex) {
      // do nothing
    }
  }
}
