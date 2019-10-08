package task1;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
    
    System.out.println("Найти значение функции: z = 2 * x + (y-2) * 5");
        
    Scanner in = new Scanner(System.in);
    System.out.print("Введите значение x: ");
    int x = in.nextInt();
    System.out.print("Введите значение y: ");
    int y = in.nextInt();
    int z = 2 * x + (y-2) * 5;
    System.out.printf("z равно = %d", z);
    System.out.println();
    }

}
