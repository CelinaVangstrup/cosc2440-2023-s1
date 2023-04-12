package vn.edu.rmit.problem3;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

// NOTE: Remember to add the following dependency to pom.xml
//   <dependency>
//      <groupId>org.eclipse.persistence</groupId>
//      <artifactId>org.eclipse.persistence.jpa</artifactId>
//      <version>4.0.1</version>
//   </dependency>


import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "students")
public class Student implements Serializable {
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

  @Override
  public String toString() {
    return String.format("ID: %d, Name: %s, Major: %s", studentId, fullName, major);
  }
}
