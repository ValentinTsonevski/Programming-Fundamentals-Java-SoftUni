import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       Map<String,List<Double>> output = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            output.putIfAbsent(name,new ArrayList<>());
           output.get(name).add(grade);
        }

     output.entrySet().stream().forEach(entry ->{
         double avgGrade = entry.getValue().stream().mapToDouble(x-> x).average().orElse(0);
       if(avgGrade >= 4.50){
           System.out.printf("%s -> %.2f%n",entry.getKey(),avgGrade);
       }
     } );
    }
}
