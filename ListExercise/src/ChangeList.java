import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")){
        String[] commands = input.split("\\s+");
        String process = commands[0];

        switch (process){
            case"Delete":
                int element = Integer.parseInt(commands[1]);
                //numbers.remove(Integer.valueOf(element));
                for (int i = 0; i < numbers.size(); i++) {
                    if(numbers.get(i) == element){
                        numbers.remove(i);
                        i--;
                    }
                }
                break;
            case"Insert":
              int number = Integer.parseInt(commands[1]);
              int index = Integer.parseInt(commands[2]);
              numbers.add(index,number);
                break;
        }
        input = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\]\\,]", ""));


    }
}
