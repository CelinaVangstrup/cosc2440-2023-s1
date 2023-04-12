package vn.edu.rmit.example;

import java.sql.*;

public class DBReader {
  public static void main(String[] args) throws SQLException {
    Connection conn = DriverManager.getConnection("jdbc:sqlite:university.db");
    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM students");
    while (rs.next()) {
      System.out.println(rs.getInt("id") + "\t" + rs.getString("full_name") + "\t" + rs.getString("major"));
    }
  }
}
