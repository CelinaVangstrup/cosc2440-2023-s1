package vn.edu.rmit.problem3;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

import jakarta.persistence.*;
import java.util.List;

public class PersistenceApp {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default2");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    /* ====== Create and manage entities ===== */

    // Uncomment the following code if you want to insert a new entity
    // Student stu = new Student();
    // stu.setStudentId(12);
    // stu.setStudentName("Anders");
    // stu.setStudentMajor("IT");
    // entityManager.getTransaction().begin();
    // entityManager.persist(stu);
    // entityManager.getTransaction().commit();

    /* ====== Querying the persistence storage ===== */
    
    entityManager.getTransaction().begin();
    Query q = entityManager.createQuery(  "SELECT s "
                                        + "FROM Student s ");
    List<Student> studentList = q.getResultList();
    for(Student s : studentList) {
      System.out.println(  s.getStudentId() 
                         + "\t" + s.getStudentName()
                         + "\t" + s.getStudentMajor());
    }
    entityManager.getTransaction().commit();
    
    /* ====== Updating the persistence storage ===== */

    // entityManager.getTransaction().begin();
    // for(Student s : studentList) {
    //   // update student major
    //   String sMajor = s.getStudentMajor();
    //   s.setStudentMajor(sMajor + "!!!!");
    // }
    // entityManager.getTransaction().commit();

    /* ====== Get a student by searching the primary key ===== */
    // Student s = entityManager.find(Student.class, 10);
    // System.out.println(s);

    // Release associated resources
    entityManager.close();
    entityManagerFactory.close();

    System.out.println("Persistence app is finished");
  }
}
