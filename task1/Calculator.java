import java.util.Scanner;

public class Calculator {
    public static double add(double a, double b ) {
        return a + b;
    }

public static double subtract(double a, double b){
    return a - b;
} 

public static double multiple(double a, double b) {
    return a * b;
}

public static double divide(double a, double b) {
    if (b == 0){
        System.out.println("not divide by zero");
        return 0;       
    }
    return a/b;
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean keepRunning = true;

    while (keepRunning) {
        System.out.println("\n java  Calculator");
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
        System.out.println("5.Exit");
        System.out.println("choose option (1 - 5): ");
        int choice = scanner.nextInt();

        if (choice == 5) {
            keepRunning = false;
            System.out.println("Exiting calculator");
            break;
        }
        System.out.println("enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("enter second number:");
        double num2 = scanner.nextDouble();

        double result = 0;
        switch (choice) {
            case 1:
            result = add(num1,num2);
                break;
                case 2:
                result = subtract(num1,num2);
                break;
                case 3:
                result = multiple(num1,num2);
                break;
                case 4:
                result = divide(num1,num2);
                break;
            default:
            System.out.println("invalid choice");
                continue;
        }
System.out.println("Result:" + result);
        
    }
    scanner.close();
}
}
