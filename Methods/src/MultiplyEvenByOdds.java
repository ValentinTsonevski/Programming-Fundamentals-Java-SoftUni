import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Math.abs(Integer.parseInt(scanner.nextLine()));
        String nums = Integer.toString(n);
        int[]numbers = Arrays.stream(nums.split("")).mapToInt(Integer::parseInt).toArray();

        int totalSum = oddSumCalculated(numbers) * evenSumCalculated(numbers);
        System.out.println(totalSum);


    }

    public static int oddSumCalculated(int[] numbers) {
        int oddSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddSum += numbers[i];
            }
        }
        return oddSum;
    }


    public static int evenSumCalculated(int[] numbers) {
        int evenSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenSum += numbers[i];
            }
        }
        return evenSum;
    }

}