//Реализовать простой калькулятор
import java.util.Scanner;;

public class task03 {
    public static void main(String[] args) {
        Scanner f_num = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first_number = f_num.nextInt();

        Scanner s_num = new Scanner(System.in);
        System.out.println("Enter second number: ");
        int second_number = s_num.nextInt();

        Scanner oper = new Scanner(System.in);
        System.out.println("Enter option: +, -, * or / : ");
        String op = oper.nextLine();

        switch (op) {
            case "+":
                int sum = first_number + second_number;
                System.out.printf("Sum of numbers is: %d", sum);
                break;
            
            case "-":
                int dif = first_number - second_number;
                System.out.printf("Dif of numbers is: %d", dif);
                break;

            case "*":
                int mul = first_number * second_number;
                System.out.printf("Multiply of numbers is: %d", mul);
                break;

            case "/":
                int div = first_number / second_number;
                System.out.printf("Dif of numbers is: %d", div);
                break;
        }
    }
}
