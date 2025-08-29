import java.util.Scanner;

public class new5 {
    public static void main(String[] args) {
        int a=12;
        int b=13;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your choice:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Result: " + (a + b));
                break;
            case 2:
                System.out.println("Result: " + (a - b));
                break;
            case 3:
                System.out.println("Result: " + (a * b));
                break;
            case 4:
                System.out.println("Result: " + (a / b));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}