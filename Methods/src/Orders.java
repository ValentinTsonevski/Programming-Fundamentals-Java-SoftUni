import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        switch (product){
            case "coffee":
coffeeCalculation(quantity);
                break;
            case "water":
waterCalculation(quantity);
                break;
            case "coke":
cokeCalculation(quantity);
                break;
            case "snacks":
snacksCalculation(quantity);
                break;
        }

    }
   public  static void coffeeCalculation(int quantity){
        double sum = quantity * 1.50;
       System.out.printf("%.2f", sum);
   }
    public  static void waterCalculation(int quantity){
        double sum = quantity * 1.00;
        System.out.printf("%.2f", sum);
    }
    public  static void cokeCalculation(int quantity){
        double sum = quantity * 1.40;
        System.out.printf("%.2f", sum);
    }
    public  static void snacksCalculation(int quantity){
        double sum = quantity * 2.00;
        System.out.printf("%.2f", sum);
    }


}
