import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightSabersPrice = Double.parseDouble(scanner.nextLine());  // 10% more
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double belts = Double.parseDouble(scanner.nextLine());     // every 6 belt is free

        double totalPrice = 0;
        double lightSabersCount = Math.ceil(studentsCount * 1.10);
        int beltsCount = studentsCount - studentsCount / 6;

        totalPrice = lightSabersCount * lightSabersPrice + robesPrice * studentsCount + belts * beltsCount;

        if(budget >= totalPrice){
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        }else {
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(budget - totalPrice));
        }
    }
}
