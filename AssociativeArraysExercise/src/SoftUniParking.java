import java.util.*;
import java.util.stream.Collectors;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> output = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
          //  List<String> commands = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
            String[] commands = scanner.nextLine().split("\\s+");
            String reg = commands[0];

            switch (reg){
                case "register":
                    String username = commands[1];
                    String licensePlate = commands[2];
                    if(output.containsKey(username)){
                        System.out.printf("ERROR: already registered with plate number %s%n",licensePlate);
                    }else {
                        output.put(username,licensePlate);
                        System.out.printf("%s registered %s successfully%n",username,licensePlate);
                    }
                    break;

                case "unregister":
               username = commands[1];
               if(!output.containsKey(username)){
                   System.out.printf("ERROR: user %s not found%n",username);
               }else {
                   output.remove(username);
                   System.out.printf("%s unregistered successfully%n",username);
               }
                    break;
            }

        }
output.forEach((k,v)-> System.out.printf("%s => %s%n",k,v));


    }
}
