package vn.edu.rmit.example.mvc;

public class StudentViewText extends StudentView {

  @Override
  public void display(Student student) {
    System.out.println("Begin text view");
    System.out.println("Student ID: " + student.getStudentID());
    System.out.println("Student Name: " + student.getFullName());
    System.out.println("Student Major: " + student.getMajor());
    System.out.println("End text view");
  }
}
