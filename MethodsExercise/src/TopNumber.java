import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            if (solutionDivisibleBy8(i) && secondCheckOddDigit(i)) {
                System.out.println(i);
            }

        }

    }

    public static boolean solutionDivisibleBy8(int number) {
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;

        }
        return sum % 8 == 0;
    }

    public static boolean secondCheckOddDigit(int number) {
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 1) {
                return true;
            }
            number = number / 10;
        }
        return false;
    }
}
