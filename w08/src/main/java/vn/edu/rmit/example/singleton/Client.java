package vn.edu.rmit.example.singleton;

public class Client {
  public static void main(String[] args) {
    // first connection
    DatabaseConnection conn1 = DatabaseConnection.getConnection("connection 1");
    System.out.println("Connection 1 = " + conn1.getConfiguration());

    // second connection
    DatabaseConnection conn2 = DatabaseConnection.getConnection("connection 2");
    System.out.println("Connection 2 = " + conn2.getConfiguration());

    // how the first connection looks like
    System.out.println("Connection 1 now is = " + conn1.getConfiguration());
  }
}
