import java.util.Scanner;

public class UserSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, sum;

        System.out.print("Enter A: ");
        a = scanner.nextInt();

        System.out.print("Enter B: ");
        b = scanner.nextInt();

        sum = a + b;

        System.out.println("Sum is: " + sum);
        scanner.close();
    }
}
