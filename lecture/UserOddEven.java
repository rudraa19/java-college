import java.util.Scanner;

public class UserOddEven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;

		System.out.print("Enter number: ");
		a = scanner.nextInt();

		if (a % 2 == 0) {
			System.out.println("Number is even.");
		} else {
			System.out.println("Number is odd.");
		}

		scanner.close();
	}
}
