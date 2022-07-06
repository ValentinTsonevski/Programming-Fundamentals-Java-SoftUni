import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());

        int strength = 0;
        for (int i = 0; i <= sb.length() - 1; i++) {
            char symbol = sb.charAt(i);

            if (strength > 0 && symbol != '>') {
                sb.deleteCharAt(i);
                strength--;
              i--;
            } else if (symbol == '>'){
                strength += Integer.parseInt(String.valueOf(sb.charAt(i + 1)));
            }

        }
        System.out.println(sb);
    }
}
