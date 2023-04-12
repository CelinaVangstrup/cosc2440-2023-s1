package vn.edu.rmit.example;

import java.sql.*;

public class DBClear {
  public static void main(String[] args) throws SQLException {
    Connection conn = DriverManager.getConnection("jdbc:sqlite:university.db");
    Statement st = conn.createStatement();
    st.executeUpdate("DELETE FROM students");
    System.out.println("Finish!");
  }
}
