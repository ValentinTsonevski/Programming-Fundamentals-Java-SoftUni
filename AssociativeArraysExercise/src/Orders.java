import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {


    static class Product {
        String name;
        double price;
        double quantity;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getQuantity() {
            return quantity;
        }

        public void setQuantity(double quantity) {
            this.quantity = quantity;
        }

        public Product(String name, double price, double quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Product> items = new LinkedHashMap<>();
        String command = scanner.nextLine();

        while (!command.equals("buy")) {
            String[] data = command.split("\\s+");
            String name = data[0];
            double price = Double.parseDouble(data[1]);
            double quantity = Double.parseDouble(data[2]);

            if(items.containsKey(name)){
          items.get(name).setPrice(price);
          items.get(name).setQuantity(items.get(name).getQuantity() + quantity);
            }else{
           items.put(name, new Product(name,price,quantity));
            }
            command = scanner.nextLine();
        }

 items.forEach((k,v)-> System.out.printf("%s -> %.2f%n",k,v.getPrice() * v.getQuantity()));
    }
}