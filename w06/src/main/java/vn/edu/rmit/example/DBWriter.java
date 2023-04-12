package vn.edu.rmit.example;

import java.sql.*;

public class DBWriter {
  public static void main(String[] args) throws SQLException {
    Connection conn = DriverManager.getConnection("jdbc:sqlite:university.db");
    Statement st = conn.createStatement();
    st.executeUpdate("INSERT INTO students(id, full_name, major) VALUES(1, 'John', 'IT')");
    st.executeUpdate("INSERT INTO students(id, full_name, major) VALUES(2, 'Alice', 'SE')");
    st.executeUpdate("INSERT INTO students(id, full_name, major) VALUES(3, 'Bob', 'CS')");
    st.executeUpdate("INSERT INTO students(id, full_name, major) VALUES(4, 'Carol', 'SE')");
    st.executeUpdate("INSERT INTO students(id, full_name, major) VALUES(5, 'David', 'IT')");
    System.out.println("Finish!");
  }
}
