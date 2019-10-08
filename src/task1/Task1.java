package task1;
import java.util.Scanner;
import java.math.BigDecimal;


public class Task1 {

    public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    System.out.print("Введите число x = ");
    int x = in.nextInt();
    System.out.print("Введите число y = ");
    int y = in.nextInt();
    System.out.printf("Сумма: %d", x + y);
    System.out.println();
    System.out.printf("Разность: %d", x - y);
    System.out.println();
    System.out.printf("Произведение: %d", x * y);
    System.out.println();
    System.out.printf("Частное: %.2f", (double)x/y);
    System.out.println();
    in.close();
   
    
    
    }
    
}
