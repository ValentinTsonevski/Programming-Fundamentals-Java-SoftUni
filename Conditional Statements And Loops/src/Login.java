import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int symbol = username.length() -1; symbol >= 0 ; symbol --) {
         password = password + username.charAt(symbol);

        }

        String input = scanner.nextLine();
        int count = 0;
        while (true){
            if(input.equals(password)){
                System.out.printf("User %s logged in.", username);
            break;
            }else {
                count ++;
                if(count == 4){
                    System.out.printf("User %s blocked!", username);
                    break;
                }
                System.out.println("Incorrect password. Try again.");
            }
          input = scanner.nextLine();


        }

    }
}
