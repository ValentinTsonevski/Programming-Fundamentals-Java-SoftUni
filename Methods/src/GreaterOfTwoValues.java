import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type){
            case "int":
          int firstNum = Integer.parseInt(scanner.nextLine());
          int secondNum = Integer.parseInt(scanner.nextLine());
                System.out.println(maxInt(firstNum, secondNum));
                break;
            case "char":
           char firstChar = scanner.nextLine().charAt(0);
           char secondChar = scanner.nextLine().charAt(0);
                System.out.println(maxChar(firstChar, secondChar));
                break;
            case "string":
           String firstText = scanner.nextLine();
           String secondText = scanner.nextLine();
                System.out.println(maxString(firstText, secondText));
                break;
        }
    }
    public static String  maxString(String text1 , String text2){
        String maxText = "";
        if(text1.compareTo(text2) > 0){
            maxText = text1;
        }else {
            maxText = text2;
        }

        return maxText;
    }
public  static char maxChar(char char1 ,char char2){
        if(char1 > char2){
            return char1 ;
        }else{
            return char2;
        }
}
public static int maxInt(int num1 ,int num2){
if(num1 > num2){
    return num1;
}else{
    return num2;
}
}

}
