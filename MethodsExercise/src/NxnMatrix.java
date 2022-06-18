import java.util.Scanner;

public class NxnMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        calculate(input);
    }


    public static void calculate(int input){
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                System.out.print(input + " ");
            }
            System.out.println();
        }
    }
}
