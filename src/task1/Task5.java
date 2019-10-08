package task1;
import java.util.Scanner;
import java.math.BigDecimal;


public class Task5 {
    public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    System.out.println("Составить алгоритм нахождения среднего арифметического двух чисел"); 
    System.out.println("z = ((x+y)/2)");
    System.out.print("Введите число x = ");
    double x = in.nextInt();
    System.out.print("Введите число y = ");
    double y = in.nextInt();
    double z = ((x+y)/2);
    System.out.printf("z = %.2f", z);
    System.out.println();
   
    
    
    }
    
}
