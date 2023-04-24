package vn.edu.rmit.example.mvc;

public class StudentController {
  Student student;
  StudentView view;

  public StudentController(Student s, StudentView v) {
    student = s;
    view = v;
    view.display(s);
  }

  public void updateName(String name) {
    student.setFullName(name);
    // force view update
    view.display(student);
  }

  public void updateMajor(String newMajor) {
    student.setMajor(newMajor);
    // force view update
    view.display(student);
  }
}
