import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int repeat = Integer.parseInt(scanner.nextLine());

    calculation(word ,repeat);
    }
  public static String calculation(String word ,int repeat){
      for (int i = 0; i < repeat; i++) {
          System.out.print(word);
      }
return word;
  }


}
