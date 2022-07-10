import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]firstLine = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[]secondLine = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
int maxLength = Math.max(firstLine.length , secondLine.length);
        for (int i = 0; i < maxLength; i++) {
            if(firstLine[i] != secondLine[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }
        }
        int sum = 0;
        for (int i = 0; i < firstLine.length; i++) {
            sum += firstLine[i];
        }
        if(Arrays.equals(firstLine, secondLine)){
            System.out.printf("Arrays are identical. Sum: %d%n", sum);
        }

    }
}
