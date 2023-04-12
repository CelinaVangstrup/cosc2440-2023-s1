package vn.edu.rmit.example;

import java.sql.*;

public class PreparedExample {
  public static void main(String[] args) throws SQLException {
    Connection conn = DriverManager.getConnection("jdbc:sqlite:university.db");
    PreparedStatement pSt = conn.prepareStatement("INSERT INTO students(id, full_name, major) VALUES(?, ?, ?)");
    pSt.setInt(1, 10);
    pSt.setString(2, "Zoe");
    pSt.setString(3, "Business");
    pSt.executeUpdate();
    System.out.println("Finish!");
  }
}
