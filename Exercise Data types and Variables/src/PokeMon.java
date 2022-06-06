import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); // poke power
        int m = Integer.parseInt(scanner.nextLine()); // distance between poke targets
        int y = Integer.parseInt(scanner.nextLine()); // exhaustion factor
        int pokedTargets = 0;
        double halfN = n * 0.50;

        while (n >= m){
        n -= m;
        pokedTargets ++;

        if(n == halfN && y != 0){
            n /= y;
        }
        }
        System.out.println(n);
        System.out.println(pokedTargets);



    }
}
