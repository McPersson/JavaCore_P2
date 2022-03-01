import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите двузначное положительное число ");
        byte chislo1 = scanner.nextByte();

        scanner.close();

        if (chislo1 > 99) {
            throw new IllegalArgumentException("Ошибка: введено трёхзначное число");
        } else if (chislo1 < 0) {
            throw new IllegalArgumentException("Ошибка: число отрицательное");
        } else if ((chislo1 / 10) == 0) {
            throw new IllegalArgumentException("Ошибка: вы ввели цифру вместо двузначного положительного числа");
        }

        byte a = (byte) (chislo1 / 10);
        byte b = (byte) (chislo1 % 10);

        if (a > b) {
            System.out.println("Цифра " + a + " больше цифры " + b);
        } else if (a < b) {
            System.out.println("Цифра " + b + " больше цифры " + a);
        }
    }
}
