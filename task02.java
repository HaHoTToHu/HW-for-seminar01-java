//Вывести все простые числа от 1 до 1000

public class task02 {
    public static void main(String[] args) {
        int number = 1000;
        int x, y;
        for (x = 2; x <= number ; x++) {
            y = 0;
            for (int i = 1; i <= x; i++) {
                if (x % i == 0)
                    y++;
            }
            if (y <= 2)
            System.out.println(x);
        }
    }
}