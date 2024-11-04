package HW1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        while (true) {
            Student student = new Student();
            System.out.println("Введите имя студента (exit чтобы выйти)");
            String name = scanner.next();
            if (name.equals("exit")) {
                break;
            }
            student.setName(name);
            System.out.println("Введите оценку");
            student.setMark(scanner.nextInt());
            students.add(student);
        }
        System.out.println("Сводная информация об студентах: ");
        for (Student student : students) {
            student.studentsInfo();
        }
        int avg = 0;
        for (Student student : students) {
            avg += student.mark;
        }
        avg = avg / students.size();
        System.out.println("Avg = " + avg);

        int max = 0;
        String name = null;
        for (Student student : students) {
            if (max < student.mark) {
                max = student.mark;
                name = student.name;
            }
        }
        System.out.println("Max mark = " + max + " " + name);

        int min = 0;
        for (Student student : students) {
            if (min > student.mark || min == 0) {
                min = student.mark;
                name = student.name;
            }
        }
        System.out.println("Min mark = " + min + " " + name);

    }
}