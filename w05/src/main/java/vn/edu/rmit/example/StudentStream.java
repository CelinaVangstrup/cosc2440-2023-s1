package vn.edu.rmit.example;

import java.util.stream.*;;

public class StudentStream {
  public static void main(String[] args) {
    Student[] students = new Student[5];
    students[0] = new Student(9, "Alice");
    students[1] = new Student(4, "Bob");
    students[2] = new Student(1, "David");
    students[3] = new Student(2, "Jerry");
    students[4] = new Student(3, "Henry");

    Stream.of(students)
      .filter(s -> s.name.length() > 3)
      .map(s -> new Student(s.sID, s.name.toUpperCase()))
      .sorted()
      .forEach(
        s -> System.out.println(s)
      );
  }
}
