import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numbers will be added from 1 to your number to get the sum. \nEnter your number here: ");
        int number = scanner.nextInt();
        System.out.println(sum(number));
    }
    public static int sum(int inputNumber){
        int sum = 0;
        for (int i = 0; i <= inputNumber; i++) {
            sum += i;
        }
        return sum;
    }
}