import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (String banWord:bannedWords) {
            if(text.contains(banWord)) {
                String replaceWord = repeatString("*",banWord.length());
                    text = text.replace(banWord, replaceWord);

            }
        }
        System.out.println(text);

    }


    public static String repeatString(String word,Integer count){
        String[] repeatArr = new String[count];
        for (int i = 0; i < count; i++) {
            repeatArr[i] = word;
        }
        return String.join("",repeatArr);
    }

}
