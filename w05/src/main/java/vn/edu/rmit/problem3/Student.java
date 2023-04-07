package vn.edu.rmit.problem3;

import java.io.Serializable;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
 */

 public abstract class Student implements Serializable {
  /**
  * student attributes   
  */
  private String studentId;
  private String fullName;
  private String major;
  private double GPA;

  /**
  * Constructor
  */
  public Student(String id, String name, String major, double GPA) {
    studentId = id;
    fullName = name;
    this.major = major;
    this.GPA = GPA;
  }

  // Getter methods
  public String getStudentId() {
    return studentId;
  }

  public String getFullName() {
    return fullName;
  }

  public String getMajor() {
    return major;
  }

  public double getGPA() {
    return GPA;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  @Override
  public String toString()
  {
    String id = getStudentId();
    String name = getFullName();
    String major = getMajor();
    String gpa = Double.toString(getGPA());
    return   "Id: " + id
           + ", Name: " + name
           + ", Major: " + major
           + ", GPA: " + gpa;
  }
}
