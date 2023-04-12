package vn.edu.rmit.problem2;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

import java.sql.*;
import java.util.Scanner;

public class DBReaderWriter {
  public static void main(String[] args) throws SQLException {
    // If you want to view the database file online,
    // you can use https://dbhub.io/ from https://sqlitebrowser.org/
    //
    // The database contains one table students which has three collumns 
    // (id: int, full_name: String, major: String)
    //
    Connection conn = DriverManager.getConnection("jdbc:sqlite:university.db");
    
    // Get a name from user
    System.out.print("Provide a name: ");
    Scanner sc = new Scanner(System.in);
    String studentName = sc.nextLine();

    // Fisplay the students whose names match the provided input
    PreparedStatement pst =
      conn.prepareStatement(  "SELECT * "
                            + "FROM students " 
                            + "WHERE full_name = ?");
    pst.setString(1, studentName);
    ResultSet rs = pst.executeQuery();
    while (rs.next()) {
      System.out.println(  rs.getInt("id") 
                         + "\t" + rs.getString("full_name")
                         + "\t" + rs.getString("major"));
    }
    
    // Let users update student data
    System.out.print("Provide a new full_name: ");
    String newName = sc.nextLine();
    System.out.print("Provide a new major: ");
    String newMajor = sc.nextLine();
    pst = conn.prepareStatement(  "UPDATE students "
                                + "SET full_name = ?, major = ? "
                                + "WHERE full_name = ?");
    pst.setString(1, newName);
    pst.setString(2, newMajor);
    pst.setString(3, studentName);
    pst.executeUpdate();

    // Release associated resources
    pst.close();
    conn.close();
    System.out.println("Updating database is finished!");
  }
}
