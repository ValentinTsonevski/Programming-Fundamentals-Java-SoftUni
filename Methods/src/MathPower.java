import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(calculation(number ,power)));

    }
    public static double calculation(double number , int power){
        double sum = 1;
        for (int i = 0; i < power; i++) {
            sum *=number;

        }
        return sum;
    }
}
