package vn.edu.rmit.example.mvc;

public class Student {
  private String studentID;
  private String fullName;
  private String major;

  public Student(String id, String name, String m) {
    studentID = id;
    fullName = name;
    major = m;
  }

  public String getStudentID() {
    return studentID;
  }

  public void setStudentID(String id) {
    studentID = id;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String name) {
    fullName = name;
  }

  public String getMajor() {
    return major;
  }

  public void setMajor(String m) {
    major = m;
  }  
}
