import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String>  words = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        LinkedHashMap<String,Integer> countsMap = new LinkedHashMap<>();

        for (String word: words) {
         String wordInLowercase = word.toLowerCase();
         if(countsMap.containsKey(word)){
             countsMap.put(wordInLowercase,countsMap.get(wordInLowercase) + 1);
         }else{
             countsMap.put(wordInLowercase,1);
         }

        }

        List<String> odd = new ArrayList<>();

        for (var entry: countsMap.entrySet()) {
            if(entry.getValue() %2 ==1){
                odd.add(entry.getKey());
            }
        }

        for (int i = 0; i < odd.size(); i++) {
            System.out.println(odd.get(i));
            if(i < odd.size() - 1){
                System.out.println(", ");
            }
        }

    }
}
