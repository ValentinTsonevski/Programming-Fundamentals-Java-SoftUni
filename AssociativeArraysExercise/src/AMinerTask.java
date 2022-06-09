import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String material = scanner.nextLine();

        Map<String, Integer> totalMine = new LinkedHashMap<>();
        while (!material.equals("stop")) {

         int quantity = Integer.parseInt(scanner.nextLine());

      if(totalMine.containsKey(material)){
        totalMine.put(material,totalMine.get(material) + quantity);
      }else {
          totalMine.put(material,quantity);
      }


           material  = scanner.nextLine();
        }

        totalMine.forEach((k,v)-> System.out.printf(" %s -> %d%n",k ,v));
    }
}
