import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VehicleCatalogue {

    static class Catalogue {
        String typeOfVehicle;
        String model;
        String color;
        int horsePower;

        @Override
        public String toString() {
            return String.format("Type: %s%n" +
                    "Model: %s%n" +
                    "Color: %s%n" +
                    "Horsepower: %d", getTypeOfVehicle().toUpperCase().charAt(0) + getTypeOfVehicle().substring(1), model, color, horsePower);
        }

        public Catalogue(String typeOfVehicle, String model, String color, int horsePower) {
            this.typeOfVehicle = typeOfVehicle;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public String getTypeOfVehicle() {
            return typeOfVehicle;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getHorsePower() {
            return horsePower;
        }


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Catalogue> catalogueList = new ArrayList<>();

        while (!input.equals("End")) {

            String[] data = input.split(" ");
            String typeOfVehicle = data[0];
            String model = data[1];
            String color = data[2];
            int horsePower = Integer.parseInt(data[3]);

            Catalogue catalogue = new Catalogue(typeOfVehicle, model, color, horsePower);

            catalogueList.add(catalogue);

            input = scanner.nextLine();
        }
        String line2 = scanner.nextLine();
        while (!line2.equals("Close the Catalogue")) {
            String model = line2;
            catalogueList.stream().filter(vehicle -> vehicle.getModel().equals(model))
                    .forEach(vehicle -> System.out.println(vehicle.toString()));

            line2 = scanner.nextLine();
        }
        List<Catalogue> cars = catalogueList.stream()
                .filter(vehicle -> vehicle.getTypeOfVehicle().equals("car")).collect(Collectors.toList());
        List<Catalogue> truck = catalogueList.stream()
                .filter(vehicle -> vehicle.getTypeOfVehicle().equals("truck")).collect(Collectors.toList());

        double carsAvgHp = avgHp(cars);
        double truckAvgHp = avgHp(truck);
        System.out.printf("Cars have average horsepower of: %.2f.%n", carsAvgHp);
        System.out.printf("Trucks have average horsepower of: %.2f.", truckAvgHp);


    }

    static double avgHp(List<Catalogue> vehicle) {
        if (vehicle.size() == 0) {
            return 0;
        }
        return vehicle.stream().mapToDouble(Catalogue::getHorsePower).sum() / vehicle.size();
    }

}
