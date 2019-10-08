package task1;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
    
    System.out.println("Найти значение функции: c = 3 + a");
        
    Scanner in = new Scanner(System.in);
    System.out.print("Введите значение a: ");
    int a = in.nextInt();
    int c = 3 + a;
    System.out.printf("c равно = %d", c);
    System.out.println();
    }
}
