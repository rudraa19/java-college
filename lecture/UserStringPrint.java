import java.util.Scanner;

public class UserStringPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userString = scanner.nextLine();

        System.out.println("\nOriginal String: " + userString);
        System.out.println("String in Uppercase: " + userString.toUpperCase());
        System.out.println("String in lowercase: " + userString.toLowerCase());
        scanner.close();
    }
}