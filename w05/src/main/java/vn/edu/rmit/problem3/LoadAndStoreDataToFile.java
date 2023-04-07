package vn.edu.rmit.problem3;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class LoadAndStoreDataToFile {
  final static String FULLTIMETYPE = "FULLTIME";
  final static String PARTTIMETYPE = "PARTTIME";
  final static String FILENAME = "students.obj";

  // Create new full-time/part-time student objects
  // using the data entered from the keyboard
  // (ask users to enter at least student id, full name,
  // major, student type, and GPA)
  // 
  // ATTENTION: More input validations can be done here!
  public static Student createStudent() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter student ID: ");  
    String sID = sc.nextLine();
    System.out.print("Enter student full name: ");  
    String sFullName = sc.nextLine();
    System.out.print("Enter student major (IT, SE, IS, etc.): ");  
    String sMajor = sc.nextLine();
    System.out.print("Enter student type (FULLTIME or PARTTIME): ");
    String sType = sc.nextLine();
    System.out.print("Enter student GPA: ");
    double sGPA = sc.nextDouble();

    Student student;
    if (sType.toUpperCase().equals(FULLTIMETYPE)) {
      student = new FullTimeStudent(sID, sFullName, sMajor, sGPA);
    } else if (sType.toUpperCase().equals(PARTTIMETYPE)) {
      System.out.print("Enter student min hour: ");
      int minHour = sc.nextInt();
      System.out.print("Enter max hour: ");
      int maxHour = sc.nextInt();
      student = new PartTimeStudent(sID, sFullName, sMajor, sGPA, minHour, maxHour);
    } else {
      System.out.println("Student type must be Fulltime or Parttime");
      student = null;
    }

    sc.close();
    return student;
  }

  // Allow the user to create several student objects
  public static void getDataFromUser(List<Student> students) {
    Scanner sc = new Scanner(System.in);
    boolean wantToExit;

    while(true) {
      System.out.print("Create a new student (Enter) or Exit (X, then Enter)? ");
      wantToExit = sc.nextLine().equals("X");
      if (!wantToExit) {
        Student student = createStudent();
        if (student != null) {
          students.add(student);
        }
      } else {
        break;
      }
    }
    sc.close();
    System.out.println("getDataFromUser is done!");
  }

  // Display all students
  public static void displayAllStudents(List<Student> students) {
    for (Student student : students) {
      System.out.println(student);
    }
  }

  // Save all data to a file
  public static void saveAllDataToFile(String fileName,
                                       List<Student> students) throws IOException {
    ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(fileName));
    writer.writeInt(students.size());
    for (Student student : students) {
      writer.writeObject(student);
    }
    // Closing file object
    writer.close();
    System.out.println("Writing data to file is done!"); 
  }

  // When this program starts, it must look for the data file in the current directory.
  // If the data file exists, the program must automatically load all student objects.
  public static void loadDataFromFile(String fileName,
                                      List<Student> students) throws IOException, ClassNotFoundException {
    File f = new File(fileName);
    if (!f.exists()) {
      System.out.println("Data file does not exist. Reading is done!"); 
      return;
    }

    ObjectInputStream reader = new ObjectInputStream(new FileInputStream(fileName));
    int size = reader.readInt();
    int idx = 0;
    while (idx < size) {
      Student student = (Student)(reader.readObject());
      students.add(student);
      idx++;
    }

    // Rember to close the file at the end
    reader.close();
    System.out.println("Reading is done!"); 
  }  
  
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    ArrayList<Student> students = new ArrayList<Student>();
    loadDataFromFile(FILENAME, students);
    getDataFromUser(students);
    displayAllStudents(students);
    saveAllDataToFile(FILENAME, students);
  }
}
