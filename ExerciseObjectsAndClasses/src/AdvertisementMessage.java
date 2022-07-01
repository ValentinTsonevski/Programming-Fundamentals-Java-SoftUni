import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {

    public static class Message {
        String[] phrase = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] event = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] author = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] city = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        public String[] getPhrase() {
            return phrase;
        }

        public String[] getEvent() {
            return event;
        }

        public String[] getAuthor() {
            return author;
        }

        public String[] getCity() {
            return city;
        }

        public void PrintMessage(int number) {
            Random random = new Random();
            for (int i = 0; i < number; i++) {
                System.out.printf("%s %s %s %s%n", this.phrase[random.nextInt(getPhrase().length)], this.event[random.nextInt(getEvent().length)], this.author[random.nextInt(getAuthor().length)], this.city[random.nextInt(getCity().length)]);
            }

        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Message message = new Message();

        message.PrintMessage(n);

    }
}
