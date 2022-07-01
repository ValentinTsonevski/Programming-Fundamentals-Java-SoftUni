import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    static class Student {
        String firstName;
        String lastName;
        double grade;

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", firstName, lastName, grade);
        }

          public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
           this.lastName = lastName;
            this.grade = grade;
          }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public double getGrade() {
            return grade;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Student> studentsArr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            String firstName = line[0];
            String lastName = line[1];
            double grade = Double.parseDouble(line[2]);
           Student student = new Student(firstName,lastName,grade);
           studentsArr.add(student);
        }
    studentsArr.stream().sorted((s1, s2)-> Double.compare(s2.getGrade(), s1.getGrade()))
            .forEach(s -> System.out.println(s.toString()));
    }
}
