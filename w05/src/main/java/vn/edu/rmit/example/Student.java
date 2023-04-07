package vn.edu.rmit.example;

import java.io.Serializable;

public class Student implements Serializable, Comparable<Student> {
  public int sID;
  public String name;

  public Student(int id, String n) {
    sID = id;
    name = n;
  }

  @Override
  public int compareTo(Student other) {
    return this.sID - other.sID;
  }

  @Override
  public String toString() {
    return String.format("sID = %d, name = %s", sID, name);
  }  
}
