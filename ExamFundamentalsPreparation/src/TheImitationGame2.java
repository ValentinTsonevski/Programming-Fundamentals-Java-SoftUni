import java.util.Scanner;

public class TheImitationGame2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder encryptedMessage = new StringBuilder(scanner.nextLine());
        String line = scanner.nextLine();

        while (!line.equals("Decode")) {
            String[] tokens = line.split("\\|");
            String command = tokens[0];

            switch (command){
                case "Move":
                    int timesToMove = Integer.parseInt(tokens[1]);
                    String part1 = encryptedMessage.substring(0,timesToMove);
                    String part2 = encryptedMessage.substring(timesToMove);
                    encryptedMessage = new StringBuilder(part2 + part1);
                    break;

                case "Insert":
                int index = Integer.parseInt(tokens[1]);
                String value = tokens[2];

                encryptedMessage.insert(index,value);
                    break;

                case "ChangeAll":
                String substring = tokens[1];
                String replacement = tokens[2];

               encryptedMessage = new StringBuilder(encryptedMessage.toString().replace(substring, replacement));
                    break;
            }
            line = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s",encryptedMessage);


    }
}
