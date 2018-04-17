package SoloTask;

import SoloTask.utils.MarksUtils;
import SoloTask.utils.StudentUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ім'я студента: ");
        String name = scanner.next();

        System.out.println("Студент навчається на бюджеті?(y/n)");
        String financingType = scanner.next();

        System.out.println("Введіть к-ть екзаменів:");
        int examQuan = scanner.nextInt();


        ArrayList<Integer> marks = new ArrayList<>();
        System.out.println("Введіть поточні оцінки студента:");
        for (int i = 0; i < examQuan; i++) {
            marks.add(scanner.nextInt());
        }

        for (int i = 0; i < marks.size(); i++) {
            marks.set(i, MarksUtils.convertMarks(marks.get(i)));
        }

        StudentUtils.checkStudent(name, financingType, marks);

    }
}
