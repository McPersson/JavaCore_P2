import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        double chislo1 = scanner.nextDouble();

        scanner.close();

        if (chislo1 > 0) {
            System.out.println(chislo1 = 0);
        } else if (chislo1 < 0) {
            System.out.println(Math.abs(chislo1));
        } else {
            System.out.println(chislo1);
        }
    }
}
