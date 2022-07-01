import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {

    static class Person{
        String name;
        String id;
        int age;

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", name,id,age);
        }

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
        List<Person> personList = new ArrayList<>();

    while (!input.equals("End")){
       String[] personArray = input.split(" ");
       String name = personArray[0];
       String id = personArray[1];
       int age = Integer.parseInt(personArray[2]);
       Person person = new Person(name,id,age);
       personList.add(person);

        input = scanner.nextLine();
    }
        personList.stream().sorted((s1, s2)-> Integer.compare(s1.getAge(), s2.getAge()))
                .forEach(s -> System.out.println(s.toString()));



    }
}
