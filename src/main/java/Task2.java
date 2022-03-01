import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число ");
        double chislo1 = scanner.nextDouble();
        System.out.print("Введите второе число ");
        double chislo2 = scanner.nextDouble();

        scanner.close();

        if (chislo1 == chislo2) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Числа не равны");
        }
    }
}
