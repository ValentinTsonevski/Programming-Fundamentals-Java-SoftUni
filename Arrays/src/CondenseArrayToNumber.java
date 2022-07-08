import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int repetitions = 0; repetitions < num.length - 1; repetitions++) {
            for (int i = 0; i < num.length -1; i++) {
                num[i] = num[i] + num[i + 1];
            }
        }
        System.out.println(num[0]);
    }
}
