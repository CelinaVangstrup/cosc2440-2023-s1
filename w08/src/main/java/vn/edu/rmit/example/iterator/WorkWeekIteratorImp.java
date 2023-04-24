package vn.edu.rmit.example.iterator;

public class WorkWeekIteratorImp implements WorkWeekIterator {
  private String[] workDays;
  private int start;

  public WorkWeekIteratorImp(String[] days) {
    workDays = days;
    start = 0;
  }
  
  @Override
  public boolean hasNext() {
    return start < workDays.length;
  }

  @Override
  public String next() {
    String result = workDays[start];
    start++;
    return result;
  }
}
