package vn.edu.rmit.problem1;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

// NOTE: Remember to add the following dependency to pom.xml
//  <dependency>
//      <groupId>org.xerial</groupId>
//      <artifactId>sqlite-jdbc</artifactId>
//      <version>3.41.0.0</version>
//  </dependency>

import java.sql.*;

public class DBReader {
  public static void main(String[] args) throws SQLException {
    // If you want to view the database file online,
    // you can use https://dbhub.io/ from https://sqlitebrowser.org/
    //
    // The database contains one table students which has three collumns 
    // (id: int, full_name: String, major: String)
    //
    Connection conn = DriverManager.getConnection("jdbc:sqlite:university.db");
    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM students");
    while (rs.next()) {
      System.out.println(  rs.getInt("id") 
                         + "\t" + rs.getString("full_name")
                         + "\t" + rs.getString("major"));
    }
    // Release associated resources
    st.close();
    conn.close();
    System.out.println("Reading database is finished!");
  }
}
