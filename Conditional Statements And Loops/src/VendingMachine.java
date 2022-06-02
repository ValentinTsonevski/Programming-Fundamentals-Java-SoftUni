import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalMoneyInserted = 0;
        String command = scanner.nextLine();
        double productPrice = 0;

        while (!command.equals("Start")) {

            double insertedMoney = Double.parseDouble(command);
            if (insertedMoney != 0.1 && insertedMoney != 0.2 && insertedMoney != 0.5 && insertedMoney != 1 && insertedMoney != 2) {
                System.out.printf("Cannot accept %.2f%n", insertedMoney);
            } else {
                totalMoneyInserted += insertedMoney;
            }
            command = scanner.nextLine();
        }

        String secondCommand = scanner.nextLine();


        while (!secondCommand.equals("End")) {
            String productName = secondCommand;
            switch (productName) {
                case "Nuts":
                    productPrice = 2.0;
                    break;
                case "Water":
                    productPrice = 0.7;
                    break;
                case "Crisps":
                    productPrice = 1.5;
                    break;
                case "Soda":
                    productPrice = 0.8;
                    break;
                case "Coke":
                    productPrice = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    secondCommand = scanner.nextLine();
                    continue;

            }

            if(totalMoneyInserted < productPrice){
                System.out.println("Sorry, not enough money");
                secondCommand = scanner.nextLine();
                continue;
            }else{
                System.out.printf("Purchased %s%n", productName);
            }
        totalMoneyInserted -= productPrice;
         secondCommand = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalMoneyInserted);

    }
}
