package vn.edu.rmit.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutput {
  public static void main(String[] args) {
    try {
      ObjectOutputStream oOStream = new ObjectOutputStream(new FileOutputStream("student.obj"));
      Student s1 = new Student(123, "Alice");
      oOStream.writeObject(s1);
      oOStream.close();
      System.out.println("Finish");
    } catch (IOException ioex) {
      // do nothing
    }
  }
}
