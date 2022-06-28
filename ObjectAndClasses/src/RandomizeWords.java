import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         String input = scanner.nextLine();
        String[] wordsArr = input.split("\\s+");

        Random rand = new Random();

        for (int i = 0; i < wordsArr.length; i++) {
            int x = rand.nextInt(wordsArr.length);
            int y = rand.nextInt(wordsArr.length);
            String oldWord = wordsArr[x];
            wordsArr[x] = wordsArr[y];
            wordsArr[y] = oldWord;
        }

        System.out.println(String.join(System.lineSeparator(), wordsArr));

    }
}
