package greenfox;

public class Student extends Person {
  public String previousOrganization;
  public int skippedDays;

  public Student(String name, int age, String gender, String previousOrganization) {
    super();
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public Student() {
    super();
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " old " + gender + " from " + previousOrganization +
            " who skipped " + skippedDays + " from the course already.");
  }

  public void getGoal() {
    System.out.println("My goal is: Be a junior software developer");
  }

  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }
}
