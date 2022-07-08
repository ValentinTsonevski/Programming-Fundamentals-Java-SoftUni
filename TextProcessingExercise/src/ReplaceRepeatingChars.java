import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        StringBuilder sb = new StringBuilder(scanner.nextLine());

        for (int i = 0; i < sb.length() - 1; i++) {
            char currentChar = sb.charAt(i);
            if(currentChar == sb.charAt(i + 1)){
                sb.deleteCharAt(i);
                i--;
            }
        }

        System.out.println(sb);
    }
}
