import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     String[] textArr = scanner.nextLine().split(" ");
    StringBuilder result = new StringBuilder();

        for (String word: textArr) {
            int count = word.length();
            for (int i = 0; i < count; i++) {
                result.append(word);
            }
        }
        System.out.print(result);
    }
}
