package task1;
import java.util.Scanner;
import java.math.BigDecimal;


public class Task6 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Количество малых бидонов n = ");
    int n = in.nextInt();
    int m = 80 + 12*n;
    System.out.printf("Количество молока в бидонах m = %d", m);
    }

}
