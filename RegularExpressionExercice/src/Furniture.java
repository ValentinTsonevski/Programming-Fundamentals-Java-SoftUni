import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = ">>(?<name>[A-Za-z]+)<<(?<price>[\\d.]+)[!](?<quantity>[\\d]+)";
        Pattern pattern = Pattern.compile(regex);
           double sum = 0;
        List<String> furnitureName = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("Purchase")) {

            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {

               String furniture = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                sum += price * quantity;

            furnitureName.add(furniture);


            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furnitureName.stream().forEach(f-> System.out.println(f.toString()));
        System.out.printf("Total money spend: %.2f", sum);

    }
}
