import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        int multiply = Integer.parseInt(scanner.nextLine());

        StringBuilder sum = new StringBuilder();

        int reminder = 0;


        for (int i = number.length()-1; i >= 0; i--) {
            int digit = Integer.parseInt(String.valueOf(number.charAt(i)));
            int digitToAdd = digit * multiply + reminder;
            if (i == 0) {
                sum.insert(0, digitToAdd);
            } else {
                int lastDigit = digitToAdd % 10;
                reminder = digitToAdd / 10;
                sum.insert(0,lastDigit);

            }
        }
        while (sum.length() >1 && sum.charAt(0) == '0') {
            sum.deleteCharAt(0);
        }
        System.out.println(sum);

    }
}
