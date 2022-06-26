
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String regex = "([@#])(?<word1>[A-Za-z]{3,})\\1\\1(?<word2>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int counter = 0;
        List<String> mirrorWords = new ArrayList<>();

        while (matcher.find()) {
            counter ++;
            String word1 = matcher.group("word1");
            String word2 = matcher.group("word2");

            String reversedWord = new StringBuffer(word2).reverse().toString();

             if(word1.equals(reversedWord)){
             String mirror = matcher.group(word1) + "=>" + matcher.group(word2);
             mirrorWords.add(mirror);
             }

            }

           if(counter != 0){
               System.out.println(counter + " word pairs found!");
           }
           else{
               System.out.println("No word pairs found!");
           }
       if(mirrorWords.size() != 0){
           System.out.println("The mirror words are:");
           String words = String.join(", ",mirrorWords);
           System.out.println(words);
       }
       else{
           System.out.println("No mirror words!");
       }

        }
    }


