import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> fistPlayerList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayerList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());


        while (fistPlayerList.size() != 0 && secondPlayerList.size() != 0) {
            int firstPlayerHand = fistPlayerList.get(0);
            int secondPlayerHand = secondPlayerList.get(0);
            fistPlayerList.remove(0);
            secondPlayerList.remove(0);


                if (firstPlayerHand > secondPlayerHand) {
                    fistPlayerList.add(firstPlayerHand);
                    fistPlayerList.add(secondPlayerHand);
                }
                else if (secondPlayerHand > firstPlayerHand) {
                    secondPlayerList.add(secondPlayerHand);
                    secondPlayerList.add(firstPlayerHand);
                }

        }
        if(fistPlayerList.size() == 0){
            System.out.printf("Second player wins! Sum: %d",getCardSum(secondPlayerList));
        }
        else {
            if(secondPlayerList.size() == 0){
                System.out.printf("First player wins! Sum: %d",getCardSum(fistPlayerList));
            }
        }





    }

    private static int getCardSum(List<Integer> secondPlayerList) {
        int sum = 0;
        for (int card: secondPlayerList) {
            sum += card;
        }
        return sum;
    }
}
