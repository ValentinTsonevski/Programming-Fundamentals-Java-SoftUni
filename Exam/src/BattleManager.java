import java.util.*;

public class BattleManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Integer>> peopleMap = new LinkedHashMap<>();

        String line = scanner.nextLine();


        List<Integer> healthAndEnergyList = new ArrayList<>();

        while (!line.equals("Results")) {
            String[] tokens = line.split(":");
            String command = tokens[0];
            switch (command) {
                case "Add":
             String name = tokens[1];
             int health = Integer.parseInt(tokens[2]);
             int energy = Integer.parseInt(tokens[3]);
            healthAndEnergyList.add(health);
            healthAndEnergyList.add(energy);
            if(!peopleMap.containsKey(name)){
                peopleMap.put(name,healthAndEnergyList);
            }
            else{
                peopleMap.get(name).set(0,peopleMap.get(name).get(0) + health);
                peopleMap.get(name).set(1,peopleMap.get(name).get(1) + energy);
            }

                    break;

                case "Attack":
                String attackerName = tokens[1];
                String defenderName = tokens[2];
                int damage = Integer.parseInt(tokens[3]);

                 if(peopleMap.containsKey(attackerName) && peopleMap.containsKey(defenderName)){
                     peopleMap.get(defenderName).set(0,peopleMap.get(defenderName).get(0) - damage);
                     peopleMap.get(defenderName).set(1,peopleMap.get(defenderName).get(1) -1);

                     peopleMap.get(attackerName).set(0,peopleMap.get(attackerName).get(0) - damage);
                  peopleMap.get(attackerName).set(1,peopleMap.get(attackerName).get(1) - 1);
                 }
                    if(peopleMap.get(defenderName).get(0) <= 0 || peopleMap.get(defenderName).get(1) <= 0){
                        System.out.printf("%s was disqualified!%n",defenderName);
                        peopleMap.remove(defenderName);
                    }
                    if(peopleMap.get(attackerName).get(1) <= 0 || peopleMap.get(attackerName).get(0) <= 0 ){
                        System.out.printf("%s was disqualified!%n",attackerName);
                        peopleMap.remove(attackerName);
                    }
                    break;

                case "Delete":
                String userToDelete = tokens[1];
                if(userToDelete.equals("All")){
                peopleMap.clear();
                }
                else{
                    peopleMap.remove(userToDelete);
                }
                    break;
            }
            line = scanner.nextLine();
        }
        System.out.printf("People count: %d%n",peopleMap.size());

        peopleMap.entrySet().forEach(entry -> System.out.printf("%s - %d - %d%n"
                ,entry.getKey(),entry.getValue().get(0),entry.getValue().get(1)));

    }
}
