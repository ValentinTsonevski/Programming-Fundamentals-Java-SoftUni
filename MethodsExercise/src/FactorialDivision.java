import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f", calculateFactorial(number1 , number2) / calculateFactorial2(number1 , number2));
    }

    public static double calculateFactorial(int n1 , int n2){
        double factorial = 1.0;

        for (int i = 1; i <= n1; i++) {
            factorial *=i;
        }
        return factorial;
    }
    public static double calculateFactorial2(int num1, int num2){
        double factorial = 1.0;
        for (int i = 1; i <= num2; i++) {
            factorial *=i;
        }
        return factorial;
    }
}
