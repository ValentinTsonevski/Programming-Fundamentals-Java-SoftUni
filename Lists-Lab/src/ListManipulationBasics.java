import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


       String commandsLine = scanner.nextLine();
        while (!commandsLine.equals("end")) {

            List <String> command = Arrays.stream(commandsLine.split(" ")).collect(Collectors.toList());

            String input = command.get(0);

            switch (input){
                case "Add":
         int numToAdd = Integer.parseInt(command.get(1));
         numbers.add(numToAdd);
                    break;
                case "Remove":
                    int numToRemove = Integer.parseInt(command.get(1));
                    numbers.remove(Integer.valueOf(numToRemove));
                    break;
                case "RemoveAt":
                    int numToRemoveAt = Integer.parseInt(command.get(1));
                    numbers.remove(numToRemoveAt);
                    break;
                case "Insert":
                    int numToInsert = Integer.parseInt(command.get(1));
                    int indexToInsert = Integer.parseInt(command.get(2));
                    numbers.add(indexToInsert ,numToInsert);
                    break;
            }

            commandsLine = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));

    }
}
