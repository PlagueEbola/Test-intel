import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        System.out.println("¬вед≥ть перше число");
        int a = first.nextInt();
        System.out.println("¬вед≥ть друге число");
        int b = first.nextInt();
        System.out.println("—ума чих чисел = "+ (a + b));
    }
}
