import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String place = scanner.nextLine();


        String regex = "([=|\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(place);
        List<String> destinations = new ArrayList<>();
        int points = 0;

        while (matcher.find()){
           String destination = matcher.group("destination");
          destinations.add(destination);
          points+= destination.length();
        }
        System.out.println("Destinations: " + String.join(", ", destinations));
        System.out.printf("Travel Points: %d", points);

    }
}
