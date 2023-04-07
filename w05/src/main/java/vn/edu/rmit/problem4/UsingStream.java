package vn.edu.rmit.problem4;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Stream;

import vn.edu.rmit.problem3.FullTimeStudent;
import vn.edu.rmit.problem3.LoadAndStoreDataToFile;
import vn.edu.rmit.problem3.Student;

public class UsingStream {
  final static String FILENAME = "students.obj";

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    List<Student> students = new ArrayList<Student>();
    LoadAndStoreDataToFile.loadDataFromFile(FILENAME, students);
    Stream<Student> st = students.stream();
    st.filter(s -> s instanceof FullTimeStudent)
      .map(s -> {s.setFullName(s.getFullName().substring(0, s.getFullName().indexOf(' ')).toUpperCase()); return s;})
      .sorted(Comparator.comparingDouble(Student::getGPA).reversed())
      .forEach(s -> System.out.println("ID="+s.getStudentId()+", NAME="+s.getFullName()+", MAJOR="+s.getMajor()+", GPA="+s.getGPA()));
  }
}
