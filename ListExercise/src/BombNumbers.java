import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> data = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int bomb = data.get(0);
        int power = data.get(1);

        while (listNumbers.contains(bomb)) {
            int bombIndex = listNumbers.indexOf(bomb);
            int start = bombIndex - power;
            int end = bombIndex + power;
            if(start < 0){
                start = 0;
            }
            if(end >= listNumbers.size()){
                end = listNumbers.size() -1;
            }
            for (int i = start; i <= end ; i++) {
                listNumbers.remove(start);

            }


        }
        int sum = 0;
        for (int i = 0; i < listNumbers.size(); i++) {
            sum += listNumbers.get(i);
        }

        System.out.print(sum);

    }
}
