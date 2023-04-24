package vn.edu.rmit.example.mvc;

public class Main {
  public static void main(String[] args) {
    Student student = new Student("s123", "Alice", "IT");
    StudentView view = new StudentViewText();
    StudentController controller = new StudentController(student, view);

    // update student name
    controller.updateName("Bob");

    // another
    Student student2 = new Student("s456", "Zoe", "SE");
    StudentView view2 = new StudentViewHTML();
    StudentController controller2 = new StudentController(student2, view2);

    // update student major
    controller2.updateMajor("AI");
  }  
}
