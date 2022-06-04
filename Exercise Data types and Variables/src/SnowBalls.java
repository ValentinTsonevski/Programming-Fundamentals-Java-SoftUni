import java.util.Scanner;

public class SnowBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); // number snowballs
        double bestSnowball = 0;
        int bestSnow = 0;
        int bestTime = 0;
        int bestQuantity = 0;

        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuantity = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((int)(snowballSnow / snowballTime), snowballQuantity);
            if(snowballValue > bestSnowball){
                bestSnowball = snowballValue;
                bestSnow = snowballSnow;
                bestTime = snowballTime;
                bestQuantity = snowballQuantity;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", bestSnow , bestTime ,bestSnowball ,bestQuantity);




    }
}
