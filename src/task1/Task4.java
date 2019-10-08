package task1;
import java.io.PrintStream;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
    
    System.out.println("Найти значение функции: z = ((a - 3) * b / 2) + c");
    
    Scanner in = new Scanner(System.in);
    System.out.print("Введите значение a: ");
    double a = in.nextInt();
    System.out.print("Введите значение b: ");
    double b = in.nextInt();
    System.out.print("Введите значение c: ");
    double c = in.nextInt();
    double z = ((a - 3) * b / 2) + c;
    System.out.printf("z равно = %.2f", z);
    System.out.println();
    }
    
}
