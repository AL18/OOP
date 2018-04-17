package Base;

import java.util.Scanner;

public class DataIO {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Введіть дані за таким шаблоном:\n");
        sb.append("Прізвище та ім'я/кільк. незадов./середній бал/\n");
        sb.append("Наприклад:\n Кіт Базіліо/2/2.4/");

        System.out.println(sb);

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("/");
        String name = sc.next();
        int n = sc.nextInt();
        float b = sc.nextFloat();
        sc.close();

        System.out.println(name + ": двійок: " + n + "; ср.бал = " + b);
    }

}
