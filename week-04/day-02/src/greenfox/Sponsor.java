package greenfox;

public class Sponsor extends Person {

  public String company;
  public int hiredStudents;

  public Sponsor(String name, int age, String gender, String company) {
    super();
    this.company = company;
    this.hiredStudents = 0;
  }

  public Sponsor() {
    super();
    hiredStudents = 0;
    company = "Google";
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " old " + gender + " who represents " + company +
            " and hired " + hiredStudents + " students so far.");
  }

  public void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software developers.");
  }

  public void hire() {
    hiredStudents++;
  }
}