import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         StringBuilder sbMessage = new StringBuilder(scanner.nextLine());
         String line = scanner.nextLine();

         while (!line.equals("Reveal")){
        String[] tokens = line.split(":\\|:");
        String command = tokens[0];

        switch (command){
            case "InsertSpace":
                int indexToInsert = Integer.parseInt(tokens[1]);
          sbMessage.insert(indexToInsert," ");
                System.out.println(sbMessage);
            break;

            case "Reverse":
          String substring = tokens[1];
          StringBuilder sbReversedSubstring = new StringBuilder();
          int startIndex = sbMessage.indexOf(String.valueOf(substring.charAt(0)));
          int endIndex = startIndex + substring.length() - 1;

          if(sbMessage.toString().contains(substring)){
          sbMessage.delete(startIndex,endIndex + 1);
              sbReversedSubstring.append(substring);
              sbReversedSubstring.reverse();
              sbMessage.append(sbReversedSubstring);
              System.out.println(sbMessage);
          }else{
              System.out.println("error");
          }
                break;

            case "ChangeAll":
            String toReplace = tokens[1];
            String replacement = tokens[2];
             sbMessage = new StringBuilder(sbMessage.toString().replace(toReplace,replacement));
                System.out.println(sbMessage);
                break;
        }
             line = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", sbMessage);
         }

    }


