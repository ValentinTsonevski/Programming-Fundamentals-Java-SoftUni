import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([#|])(?<itemName>[A-Za-z\\s]+)\\1(?<date>[\\d]{2}[\\/][\\d]{2}[\\/][\\d]{2})\\1(?<calories>[0-9]{1,5})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<Food> foods = new ArrayList<>();

        while (matcher.find()) {
            String itemName = matcher.group("itemName");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));
            Food food = new Food(itemName,date,calories);
            foods.add(food);
        }
        int days = foods.stream().mapToInt(Food::getCalories).sum() / 2000;
        System.out.printf("You have food to last you for: %d days!%n",days);
        foods.forEach(System.out::println);
    }

    static class Food {
        String name;
        String date;
        int calories;

        public int getCalories() {
            return calories;
        }

        public Food(String name, String date, int calories) {
            this.name = name;
            this.date = date;
            this.calories = calories;
        }

        @Override
        public String toString() {
            return String.format("Item: %s, Best before: %s, Nutrition: %d",this.name,this.date,this.calories);
        }
    }

}