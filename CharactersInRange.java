import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);

        print(start , end);
    }

    public static void print(char start ,char end){
        if(start > end) {
            char temporary = start;
            start = end;
            end = temporary;
            for (int i = start + 1; i < end; i++) {
                System.out.printf("%c ", i);
            }
        }
        else{
            for (int i = start + 1; i < end; i++) {
                System.out.printf("%c ", i);
            }
        }
    }
}
