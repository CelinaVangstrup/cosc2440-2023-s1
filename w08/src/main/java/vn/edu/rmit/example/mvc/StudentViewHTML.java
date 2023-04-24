package vn.edu.rmit.example.mvc;

public class StudentViewHTML extends StudentView {

  @Override
  public void display(Student student) {
    System.out.println("<h3>Student Info</h3>");
    System.out.println("<ul>");
    System.out.printf("<li>Student ID: %s</li>\n", student.getStudentID());
    System.out.printf("<li>Student Name: %s</li>\n", student.getFullName());
    System.out.printf("<li>Student Major: %s</li>\n", student.getMajor());
    System.out.println("</ul>");
  }
}
