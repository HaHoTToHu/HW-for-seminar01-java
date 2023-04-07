//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! 
//(произведение чисел от 1 до n)

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner triangle = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int number = triangle.nextInt();

        Scanner factor = new Scanner(System.in);
        System.out.println("Enter number 2: ");
        int f_number = factor.nextInt();

        int tr_num = 0;
        int factorial = 1;
        for (int i = 0; i <= number; i++){
            tr_num += i;
        }
        for (int j = 1; j <= f_number; j++){
            factorial *= j;
        }
        System.out.printf("Our triangle number: %d", tr_num);
        System.out.println();
        System.out.printf("Our factorial: %d", factorial);
    }
    
}