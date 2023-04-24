package vn.edu.rmit.example.iterator;

public class Client {
  public static void main(String[] args) {
    System.out.println("The work week of a hard-working person");
    WorkWeekContainer workWeek = new WorkWeekContainerHardWorking();
    WorkWeekIterator it = workWeek.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }

    System.out.println("The work week of a lazy person");
    WorkWeekContainer workWeek2 = new WorkWeekContainerLazy();
    it = workWeek2.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
