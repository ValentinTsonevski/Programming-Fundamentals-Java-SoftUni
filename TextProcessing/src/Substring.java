import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String removeText = scanner.nextLine();
        String wholeText = scanner.nextLine();
        int index = wholeText.indexOf(removeText);

        while (index != -1) {
            wholeText = wholeText.replace(removeText, "");
            index = wholeText.indexOf(removeText);

        }
        System.out.print(wholeText);

    }
}
