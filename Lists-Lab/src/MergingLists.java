import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listNumber1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> listNumber2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int minSize = Math.min(listNumber1.size(), listNumber2.size());
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < minSize; i++) {
            result.add(listNumber1.get(i));
            result.add(listNumber2.get(i));
        }

        if (listNumber1.size() > listNumber2.size()) {
            result.addAll(listNumber1.subList(minSize, listNumber1.size()));
        } else {
            result.addAll(listNumber2.subList(minSize, listNumber2.size()));
        }

        System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
    }

}
