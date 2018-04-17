package SoloTask.utils;

import SoloTask.Main;

import java.util.ArrayList;

public class StudentUtils {

    public static void checkStudent(String name,String finacingType, ArrayList marks) {
        if (finacingType.equalsIgnoreCase("y") && MarksUtils.checkMarks(marks)) {
            System.out.println("Студент " + name + " має стипендію");
        } else {
            System.out.println("Студент " + name + " не має стипендії");
        }
    }

}
