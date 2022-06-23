import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCommands = Integer.parseInt(scanner.nextLine());

      List<String> list = new ArrayList<>();


        for (int i = 0; i < numberCommands; i++) {
            List<String> commands = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
          String name = commands.get(0);

          if(commands.size() < 4){
              if(list.contains(name)){
                  System.out.printf("%s is already in the list!%n", name);
              }else {
         list.add(name);}
          }
          if (commands.size() > 3){
              if(!list.contains(name)){
                  System.out.printf("%s is not in the list!%n", name);
              }else{
              list.remove(name);}
          }
        }
list.forEach(System.out::println);


    }
}
