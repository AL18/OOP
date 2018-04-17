package Base;

import java.util.Arrays;
import java.util.Scanner;

public class MathExploration {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть довжину масиву");
        int size = scan.nextInt();
        scan.close();

        double[] arr = new double[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random()*100;
        }

        Arrays.sort(arr);

        System.out.println("Ось числа масиву: ");
        for (double d: arr) {
            System.out.printf("%6.2f", d);
        }
        System.out.println();
    }

}
