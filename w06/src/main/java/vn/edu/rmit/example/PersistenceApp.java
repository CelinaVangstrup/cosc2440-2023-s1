package vn.edu.rmit.example;

import jakarta.persistence.*;

public class PersistenceApp {
  public static void main(String[] args) {
    Student stu = new Student();
    stu.setStudentId(123);
    stu.setStudentName("Phong");
    stu.setStudentMajor("IT");

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();
    entityManager.persist(stu);
    entityManager.getTransaction().commit();
    entityManager.close();
    entityManagerFactory.close();

    System.out.println("Finish");
  }
}
