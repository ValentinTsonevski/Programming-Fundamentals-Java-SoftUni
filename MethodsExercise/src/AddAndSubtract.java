import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        System.out.println(add(num1, num2) - num3);
    }

    public static int add(int number1, int number2){
int sum = number1 + number2;
return sum;
    }
}
