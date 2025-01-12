import java.util.Scanner;

public class CommandLineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
        char opr;

        System.out.print("Enter a : ");
        a = scanner.nextInt();
        
        System.out.print("Enter b : ");
        b = scanner.nextInt();
        
        System.out.print("Enter Operator : ");
        opr = scanner.next().charAt(0);

        switch (opr) {
            case '+':
                c = a + b;
                break;
            case '-':
                c = a - b;
                break;
            case '*':
                c = a * b;
                break;
            case '/':
                c = a / b;
        }
        System.out.print("Ans is : ");
        System.out.println(a + " " + opr + " " + b + " = " + c);
        scanner.close();
    }

    
}