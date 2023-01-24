import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = first.nextInt();
        System.out.println("Enter the second number");
        int b = first.nextInt();
        System.out.println("The sum of the numbers = "+ (a + b));
    }
}
