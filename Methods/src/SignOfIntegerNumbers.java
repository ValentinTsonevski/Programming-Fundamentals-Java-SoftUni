import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

        result(numbers);
    }


    public static void result(int numbers){
        if(numbers > 0){
            System.out.printf("The number %d is positive.", numbers);
        }else if (numbers < 0){
            System.out.printf("The number %d is negative.", numbers);
        }else {
            System.out.println("The number 0 is zero.");
        }

    }


}


