import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String line = scanner.nextLine();
        while (!line.equals("Complete")){
          String[] tokens = line.split("\\s+");
          String command = tokens[0];

          switch (command){
              case "Make":
          if(tokens[1].equals("Upper")){
              String inputToUpper = input.toUpperCase();
              input = input.replace(input,inputToUpper);
              System.out.println(input);
          }
          else{
          String inputToLower = input.toLowerCase();
          input = inputToLower.replace(input,inputToLower);
              System.out.println(input);
          }
                  break;

              case "GetDomain":
           int index = Integer.parseInt(tokens[1]);
           String toPrint = input.substring(input.length()-index);
                  System.out.print(toPrint);
                  break;

              case "GetUsername":
            if(!input.contains("@")){
                System.out.printf("The email %s doesn't contain the @ symbol.",input);
            }
            else {

           String substringToPrint = input.substring(0,input.indexOf("@"));
                System.out.println(substringToPrint);
            }
                  break;

              case "Replace":
             String toReplace = tokens[1];
                  String replace = input.replace(toReplace, "-");
                  System.out.println(replace);
                  break;

              case "Encrypt":
                  for (int i = 0; i < input.length(); i++) {
                      int symbolToPrint = input.charAt(i);
                      System.out.print(symbolToPrint + " ");
                  }
                  break;
          }
            line = scanner.nextLine();
        }



    }
}
