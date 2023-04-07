package vn.edu.rmit.problem3;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
 */

 public class FullTimeStudent extends Student implements CanJoinProject {
  /**
   * The constructor is not inherited
   * but we can access it with "super"
   * @param id student Id
   * @param name full name
   * @param major major (IT, SE, IS, etc.)
   * @param GPA GPA score
   */
  public FullTimeStudent(String id, String name, String major, double GPA) {
    super(id, name, major, GPA);
  }

  /**
   * String representation of this student
   * <p>
   * This method is called automatically when you use a FullTimeStudent
   * object in places where a String value is required.
   * </p>
   */
  @Override
  public String toString() {
    String fromParent = super.toString();
    return   "FullTime: "
           + "<"
           + fromParent
           + ">";
  }
}

