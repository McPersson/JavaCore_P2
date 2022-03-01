import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число ");
        double chislo1 = scanner.nextDouble();
        System.out.print("Введите второе число ");
        double chislo2 = scanner.nextDouble();

        scanner.close();

        if (chislo1 > chislo2) {
            System.out.println(chislo2 + " " + chislo1);
            System.out.println(chislo1 + " " + chislo2);
        } else if (chislo1 < chislo2) {
            System.out.println(chislo1 + " " + chislo2);
            System.out.println(chislo2 + " " + chislo1);
        } else {
            System.out.println("Числа равны: " + chislo1 + " " + chislo2);
        }
    }
}
