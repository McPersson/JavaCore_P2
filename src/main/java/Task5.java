import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число ");
        int chislo1 = scanner.nextInt();

        scanner.close();

        if (chislo1 < 0) {
            System.out.println(Math.pow(Math.abs(chislo1), 2));
        } else {
            System.out.println("Ошибка");
        }
    }
}
