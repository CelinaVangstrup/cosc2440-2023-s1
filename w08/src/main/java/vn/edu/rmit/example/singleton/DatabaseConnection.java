package vn.edu.rmit.example.singleton;

public class DatabaseConnection {
  private static DatabaseConnection conn;
  private String configuration;

  // prevent direct instantiation
  private DatabaseConnection(String config) {
    configuration = config;
  }

  public void setConfiguration(String config) {
    configuration = config;
  }

  public String getConfiguration() {
    return configuration;
  }

  public static DatabaseConnection getConnection(String config) {
    if (conn == null) {
      conn = new DatabaseConnection(config);
    }
    conn.setConfiguration(config);
    return conn;
  }
}
