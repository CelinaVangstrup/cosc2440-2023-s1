package vn.edu.rmit.example;

import java.io.File;

public class FileDir {
  public static void main(String[] args) {
    System.out.println("Content of the current directory");
    File current = new File(".");
    for (File f : current.listFiles()) {
      String type = "directory";
      if (f.isFile()) {
        type = "file";
      }
      System.out.printf("File %s is a %s\n", f.getName(), type);
    }
  }  
}
