package vn.edu.rmit.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInput {
  public static void main(String[] args) {
    try {
      ObjectInputStream oIStream = new ObjectInputStream(new FileInputStream("student.obj"));
      Student s1 = (Student)oIStream.readObject();
      System.out.println(s1);
      oIStream.close();
    } catch (IOException ioex) {
      // do nothing
    } catch (ClassNotFoundException cex) {
      // do nothing
    }
  }
}
