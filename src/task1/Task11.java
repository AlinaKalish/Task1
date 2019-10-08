package task1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Введите число a = ");
    int a = in.nextInt();
    System.out.print("Введите число b = ");
    int b = in.nextInt();
    if (a<b) {
            System.out.println("a является наименьшим числом");
        } else {
            System.out.println("b является наименьшим числом");
        }
}
}
