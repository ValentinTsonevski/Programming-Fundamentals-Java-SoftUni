import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ages = Integer.parseInt(scanner.nextLine());
        String type = " ";
        if (ages >= 0 && ages <= 2) {
            type = "baby";
        } else if (ages >=3 && ages <= 13) {
            type = "child";
        }else if (ages >=14 && ages <= 19) {
            type = "teenager";
        }else if (ages >=20 && ages <= 65) {
            type = "adult";
        }else if (ages >=66 ){
            type = "elder";
        }
        System.out.println(type);


    }
}
