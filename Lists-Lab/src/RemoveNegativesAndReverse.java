import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        listNumbers.removeIf(n -> n < 0);
        Collections.reverse(listNumbers);

        if(listNumbers.isEmpty()){
            System.out.println("empty");
        }else{
            System.out.println(listNumbers.toString().replaceAll("[\\[\\],]", ""));
        }

    }

}
