package SoloTask.utils;

import java.util.ArrayList;

public class MarksUtils {

    public static int convertMarks(int a) {
        if (a < 60) return 2;
        else if (a >= 60 && a <= 74) return 3;
        else if (a >= 75 && a <= 89) return 4;
        return 5;

    }

    public static boolean checkMarks(ArrayList<Integer> marks) {
        for (Integer mark : marks) {
            if (mark <= 3) return false;
        }
        return true;
    }

}
