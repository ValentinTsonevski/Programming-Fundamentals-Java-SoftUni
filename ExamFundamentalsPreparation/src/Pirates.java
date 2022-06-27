import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Town> townsMap = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("Sail")) {
            String[] cityArray = input.split("\\|\\|");
            String name = cityArray[0];
            int population = Integer.parseInt(cityArray[1]);
            int gold = Integer.parseInt(cityArray[2]);

            if (townsMap.containsKey(name)) {
                Town town = townsMap.get(name);
                town.setPopulation(town.getPopulation() + population);
                town.setGold(town.getGold() + gold);
            } else {
                Town town = new Town(name, population, gold);
                townsMap.put(name, town);
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] events = input.split("=>");
            String command = events[0];
            String name = events[1];
           Town town = townsMap.get(name);

            switch (command) {
                case "Plunder":
                int people = Integer.parseInt(events[2]);
                int gold = Integer.parseInt(events[3]);
                town.setGold(town.getGold() - gold);
                town.setPopulation(town.getPopulation() - people);
                    System.out.printf("%s plundered! %d gold stolen, %s citizens killed.%n",name,gold,people);
                    if(town.getPopulation() == 0 || town.getGold() == 0){
                        System.out.printf("%s has been wiped off the map!%n",name);
                        townsMap.remove(town.getName());
                    }
                    break;

                case "Prosper":
                    gold = Integer.parseInt(events[2]);
                    if(gold < 0){
                        System.out.println("Gold added cannot be a negative number!");
                        input = scanner.nextLine();
                        continue;
                    }
                    else {
                        town.setGold(town.getGold() + gold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",gold,name,town.getGold());
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        if(townsMap.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
        else{
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", townsMap.size());
         townsMap.values().forEach(System.out::println);
        }

    }


    static class Town {
        String name;
        int population;
        int gold;

        @Override
        public String toString() {
            return String.format("%s -> Population: %s citizens, Gold: %d kg",name,population,gold);
        }

        public Town(String name, int population, int gold) {
            this.name = name;
            this.population = population;
            this.gold = gold;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public int getGold() {
            return gold;
        }

        public void setGold(int gold) {
            this.gold = gold;
        }
    }
}
