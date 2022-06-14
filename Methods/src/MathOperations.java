import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int number2 = Integer.parseInt(scanner.nextLine());           /// divide /  odd * // plus + // minus -

        if (operator == '/') {
            System.out.printf("%.0f", divide(number, number2));
        } else if (operator == '*') {
            System.out.printf("%.0f", odd(number, number2));
        } else if (operator == '+') {
            System.out.printf("%.0f", plus(number, number2));
        } else if (operator == '-') {
            System.out.printf("%.0f", minus(number, number2));
        }
    }

    public static double divide(int num1, int num2) {
        double sum = num1 / num2;
        return Math.ceil(sum);
    }

    public static double odd(int num1, int num2) {
        double sum = num1 * num2;
        return sum;
    }

    public static double plus(int num1, int num2) {
        double sum = num1 + num2;
        return sum;
    }

    public static double minus(int num1, int num2) {
        double sum = num1 - num2;
        return sum;
    }
}