import java.util.*;
import java.util.stream.Collectors;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        Map<Character, Integer> words = new LinkedHashMap();

        for (String text : input) {

            for (int i = 0; i < text.length(); i++) {
                char symbol = text.charAt(i);
                if (!words.containsKey(symbol)) {
                    words.put(symbol, 1);
                } else {
                    words.put(symbol, words.get(symbol) + 1);
                }
            }
        }
        words.forEach((k, v) -> System.out.printf("%c -> %d%n", k, v));

    }
}
