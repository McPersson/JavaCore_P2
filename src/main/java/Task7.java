import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        int chislo1;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите целое трехзначное положительное число ");
            chislo1 = scanner.nextInt();
            if (chislo1 > 999 || chislo1 < 100) {
                System.out.println("Введено не правильное число");
            } else {
                break;
            }
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
        scanner.close();

    }
}