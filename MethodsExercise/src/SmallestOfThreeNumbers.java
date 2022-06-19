import java.util.Arrays;
import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int number1 = Integer.parseInt(scanner.nextLine());
         int number2 = Integer.parseInt(scanner.nextLine());
         int number3 = Integer.parseInt(scanner.nextLine());
        System.out.println(calculate(number1 ,number2 ,number3));
    }
       public  static int calculate(int n1 , int n2 , int n3){
        int[]numbers = {n1 , n2 ,n3};
           Arrays.sort(numbers);

        return numbers[0];
       }

}
