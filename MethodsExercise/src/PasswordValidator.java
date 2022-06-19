import java.util.Locale;
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
 if (passwordCharacters(input) && passwordCheck2(input) && check2Digits(input)){
     System.out.println("Password is valid");
 }
 if(!passwordCharacters(input)){
     System.out.println("Password must be between 6 and 10 characters");
 }
if(!passwordCheck2(input)){
    System.out.println("Password must consist only of letters and digits");
}
        if(!check2Digits(input)){
            System.out.println("Password must have at least 2 digits");
        }
    }

    public static boolean passwordCharacters(String input) {
        if (input.length() >= 6 && input.length() <= 10) {
            return true;
        }
            return false;
    }

    public static boolean passwordCheck2(String input) {
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.toLowerCase().charAt(i);
            if ((symbol < 97 || symbol > 122) && (symbol < 48 || symbol > 57)){
                return false;
            }
        }

        return true;
    }

    public static boolean check2Digits(String input) {
        int counterDigits = 0;
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (symbol >= 48 && symbol <= 57) {
                counterDigits ++;
            }
            if(counterDigits == 2){
                return true;
            }
        }
        return false;
    }
}
