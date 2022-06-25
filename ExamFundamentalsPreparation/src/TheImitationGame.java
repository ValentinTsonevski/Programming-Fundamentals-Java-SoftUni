import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Decode")){
       String[] commands = input.split("\\|");
       String commandName = commands[0];

       switch (commandName){
           case "Move":
           message = move(message,Integer.parseInt(commands[1]));
               break;

           case "Insert":
             message = insert(message,Integer.parseInt(commands[1]),commands[2]);
               break;

           case "ChangeAll":
            message = ChangeAll(message,commands[1],commands[2]);
               break;

       }

       input = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s", message);
    }

    private static String ChangeAll(String message, String substring, String toReplaceWith) {

        return message.replace(substring,toReplaceWith);
    }

    private static String insert(String message, int index, String substring) {
       String firstPart = message.substring(0,index);
       String secondPart = message.substring(index);
        return firstPart + substring + secondPart;
    }

    private static String move(String message, int length) {
        String part1 = message.substring(0,length);
        String part2 = message.substring(length);

        return  part2 + part1;
    }
}
