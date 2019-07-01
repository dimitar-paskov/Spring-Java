import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class EP23AverageGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");
            String name = tokens[0];
            double[] grades = new double[tokens.length - 1];

            for (int j = 1; j < tokens.length; j++) {
                grades[j-1] = Double.parseDouble(tokens[j]);
            }

            Student student = new Student(name, grades);
            students.add(student);

        }

        Comparator<Student> comparator = Comparator.comparing(Student::getName);
        comparator = comparator.thenComparing(Comparator.comparing(Student::getAverageGrade).reversed());


        Stream<Student> studentStream = students.stream().sorted(comparator);
        studentStream
                .filter(student -> student.getAverageGrade()>= 5.00)
                .forEach(System.out::println);


    }
}

class Student {
    String name;
    double[] grades;

    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public double[] getGrades() {
        return grades;
    }

    public double getAverageGrade() {
        double averageGrade = 0;
        for (int i = 0; i < this.grades.length; i++) {
            averageGrade += this.grades[i];
        }
        averageGrade /= grades.length;
        return averageGrade;
    }

    @Override
    public String toString() {
        String info = String.format("%s -> %.2f", this.name, this.getAverageGrade());
        return info;
    }
}
