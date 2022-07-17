import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "(U[$])(?<username>[A-Z][a-z]{2,})\\1(P[@][$])(?<password>[A-Za-z]{5,}[\\d]+)\\3";
        Pattern pattern = Pattern.compile(regex);
        int countLogin = 0;
        int numberOfInputs = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfInputs; i++) {
            String login = scanner.nextLine();
            Matcher matcher = pattern.matcher(login);

            if(matcher.find()){
                System.out.println("Registration was successful");
                System.out.printf("Username: %s, Password: %s%n",matcher.group("username"),matcher.group("password"));
           countLogin++;
            }
            else {
                System.out.println("Invalid username or password");
            }
        }
        System.out.printf("Successful registrations: %d",countLogin);








    }
}
