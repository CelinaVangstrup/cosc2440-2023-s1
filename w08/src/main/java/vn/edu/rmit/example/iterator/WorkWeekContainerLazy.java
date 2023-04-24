package vn.edu.rmit.example.iterator;

public class WorkWeekContainerLazy implements WorkWeekContainer {
  private String[] workDays;

  public WorkWeekContainerLazy() {
    workDays = new String[] {
      "Mon",
      "Tue",
      "Wed",
      "No...",
      "No......."
    };
  }

  @Override
  public WorkWeekIterator iterator() {
    return new WorkWeekIteratorImp(workDays);
  }
}

