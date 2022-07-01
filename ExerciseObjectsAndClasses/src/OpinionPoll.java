import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {

    static  class Person{
        String name;
        int age;

        @Override
        public String toString() {
            return String.format("%s - %d", name, age);
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
       int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
          String[] line = scanner.nextLine().split(" ");

            Person person = new Person(line[0], Integer.parseInt(line[1]));
            people.add(person);
        }

        people.stream().filter(person -> person.getAge() > 30).forEach(p -> System.out.println(p.toString()));
    }
}
