package tandemloop1;
import java.util.Scanner;

class Calculator {
    double add(double a, double b) {
        return a + b;
    }
    double subtract(double a, double b) {
        return a - b;
    }
    double multiply(double a, double b) {
        return a * b;
    }
    double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add/subtract/multiply/divide): ");
        String op = sc.next().toLowerCase();

        double result = 0;
        if (op.equals("add")) {
            result = c.add(a, b);
        } else if (op.equals("subtract")) {
            result = c.subtract(a, b);
        } else if (op.equals("multiply")) {
            result = c.multiply(a, b);
        } else if (op.equals("divide")) {
            result = c.divide(a, b);
        } else {
            System.out.println("Invalid operation");
            sc.close();
            return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}