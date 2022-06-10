import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String winner = "";

        boolean isWinner = false;
        Map<String, Integer> items = new LinkedHashMap<>();
        items.put("shards",0);
        items.put("fragments",0);
        items.put("motes",0);

        while (!isWinner) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int i = 0; i < input.length - 1; i += 2) {
                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1].toLowerCase();

                items.putIfAbsent(material, 0);
                items.put(material, items.get(material) + quantity);

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {

                    if (items.get(material) >= 250) {
                        items.put(material, items.get(material) - 250);
                        isWinner = true;
                        winner = material;
                        break;
                    }
                }

            }


            }
        switch (winner) {

            case "shards":
                System.out.println("Shadowmourne obtained!");
                break;
            case "fragments":
                System.out.println("Valanyr obtained!");
                break;
            case "motes":
                System.out.println("Dragonwrath obtained!");
                break;
        }

        items.forEach((k, v)->System.out.printf("%s: %d%n", k ,v));
    }
}
