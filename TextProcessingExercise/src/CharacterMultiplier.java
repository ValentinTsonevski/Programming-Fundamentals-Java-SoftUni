import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        String[] input = scanner.nextLine().split(" ");
        char[] text1 = input[0].toCharArray();
        char[] text2 = input[1].toCharArray();

        int min = Math.min(text1.length, text2.length);
        int max = Math.max(text1.length, text2.length);
        int sum = 0;

        for (int i = 0; i < max; i++) {
            if (i < min) {
                sum += text1[i] * text2[i];
            } else if (text1.length > text2.length) {
                sum += text1[i];
            } else {
                sum += text2[i];
            }

        }
        System.out.println(sum);


    }
}
