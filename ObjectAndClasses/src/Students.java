import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Students {

    public static class Student {
        String firstName;
        String lastName;
        String age;
        String homeTown;

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getAge() {
            return age;
        }

        public String getHomeTown() {
            return homeTown;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();
        String input = scanner.nextLine();


        while (!input.equals("end")) {
            String[] inputArr = input.split("\\s+");
           String firstName = inputArr[0];
           String lastName = inputArr[1];
           String age = inputArr[2];
           String homeTown = inputArr[3];

           Student currentStudent = new Student();
           currentStudent.setFirstName(firstName);
           currentStudent.setLastName(lastName);
           currentStudent.setAge(age);
           currentStudent.setHomeTown(homeTown);

           studentList.add(currentStudent);

            input = scanner.nextLine();
        }
        String cityName = scanner.nextLine();

        for (Student item : studentList) {
            if(cityName.equals(item.getHomeTown())){
                System.out.printf("%s %s is %s years old%n", item.firstName, item.lastName,item.age);
            }
        }


    }
}
