package vn.edu.rmit.example.iterator;

public class WorkWeekContainerHardWorking implements WorkWeekContainer {
  private String[] workDays;

  public WorkWeekContainerHardWorking() {
    workDays = new String[] {
      "Mon",
      "Tue",
      "Wed",
      "Thu",
      "Fri",
      "Sat",
      "Sun"
    };
  }

  @Override
  public WorkWeekIterator iterator() {
    return new WorkWeekIteratorImp(workDays);
  }
}
