import java.util.*;

public class Courses {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> output = new LinkedHashMap<>();

      String command = scanner.nextLine();

      while (!command.equals("end")){
      String courseName = command.split(" : ")[0];
      String studentName = command.split(" : ")[1];

      output.putIfAbsent(courseName,new ArrayList<>());
       output.get(courseName).add(studentName);


     command = scanner.nextLine();
      }
     for(Map.Entry<String,List<String>> entry:output.entrySet()){
         System.out.printf("%s: %d%n",entry.getKey(),entry.getValue().size());
         for(String student : entry.getValue()){
             System.out.printf("-- %s%n",student);
         }
     }

    }
}
