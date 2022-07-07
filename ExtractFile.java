import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int index1 = input.lastIndexOf("\\");
        int index2 = input.lastIndexOf(".");
        String fileName = input.substring(index1 + 1, index2);
        String extension = input.substring(index2 + 1);

        System.out.println("File name: ".concat(fileName));
        System.out.println("File extension: ".concat(extension));


    }
}
