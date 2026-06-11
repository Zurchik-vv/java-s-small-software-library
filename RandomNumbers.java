import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Введите число:");
        double num = sc.nextDouble();

        System.out.println("Вероятность умножения либо деления:");
        System.out.println("50% — шанс умножения и 50% деления.\n" +
                "\n" +
                "80% что будет умножение, 20% — деление.\n" +
                "\n" +
                "100 — всегда умножение.\n" +
                "\n" +
                "0 — всегда деление.");
        int Percent = sc.nextInt();

        if (Percent < 0 || Percent > 100) {
            System.out.println("Erorr");
            return;

        }
        boolean isMultiply = rand.nextInt(100) < Percent;

        int factor = rand.nextInt(9) + 1;

        double result;
        String operation;
        if (isMultiply) {
            result = num * factor;
            operation = "умножили на";
        } else {

            result = num / factor;
            operation = "разделили на";
        }

        System.out.printf("Вы %s %d. Исходное число: %.2f, результат: %.2f%n",
                operation, factor, num, result);

        sc.close();
    }
}



