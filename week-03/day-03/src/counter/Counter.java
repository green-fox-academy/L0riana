package counter;

public class Counter {

  private int counter;
  private int number;


  public Counter(int number) {

    counter = 0;
  }

  public int add(int number){
    counter += number;
    return counter;
  }

  public int add(){
    counter++;
    return counter;
  }

  public int get(){
    return counter;
  }

  public int reset(int counter){
    this.counter = counter;
    return counter;
  }
}
