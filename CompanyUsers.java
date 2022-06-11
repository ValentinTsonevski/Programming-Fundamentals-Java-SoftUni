import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> output = new LinkedHashMap<>();
        String command = scanner.nextLine();

        while (!command.equals("End")){
        String companyName = command.split(" -> ")[0];
        String employeeId = command.split(" -> ")[1];

            if (!output.containsKey(companyName)){
                output.put(companyName, new ArrayList<>());
                output.get(companyName).add(employeeId);
            }else {
                if (!output.get(companyName).contains(employeeId)) {
                    output.get(companyName).add(employeeId);
                }
            }
            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : output.entrySet()){
            List<String> temp = entry.getValue();
            System.out.printf("%s%n", entry.getKey());
            for (String s : temp){
                System.out.printf("-- %s%n", s);
            }
        }


    }
}
