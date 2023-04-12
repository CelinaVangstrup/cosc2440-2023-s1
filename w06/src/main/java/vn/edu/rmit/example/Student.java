package vn.edu.rmit.example;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student implements java.io.Serializable {
  @Id
  @Column(name = "id")
  private int studentId;
  @Column(name = "full_name")
  private String fullName;
  @Column(name = "major")
  private String major;

  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  public int getStudentId() {
    return studentId;
  }

  public void setStudentName(String name) {
    fullName = name;
  }

  public String getStudentName() {
    return fullName;
  }

  public void setStudentMajor(String major) {
    this.major = major;
  }

  public String getStudentMajor() {
    return major;
  }
}