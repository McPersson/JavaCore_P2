import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трехзначное положительное число ");
        int chislo1 = scanner.nextInt();

        scanner.close();

        if (chislo1 < 100) {
            throw new IllegalArgumentException("Ошибка: введено не трехзначное положительное число");
        }

        int a = (chislo1 / 100);
        int b = (chislo1 / 10 % 10);
        int c = (chislo1 % 10);

        if (chislo1 > 500) {
            chislo1 = (c * 100) + (b * 10) + a;
            System.out.println(chislo1);
        } else {
            chislo1 = (a * 100) + (c * 10) + b;
            System.out.println(chislo1);
        }
    }
}