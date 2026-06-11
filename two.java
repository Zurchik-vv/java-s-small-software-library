import java.util.Random;
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();


        System.out.print("Введите число: ");
        double number = scanner.nextDouble();


        System.out.print("Вероятность сложения,вычитания,умножения и деления в процентах (0–100): ");
        System.out.println("Если задашь 100% умножения всегда будет умножение.\n" +
                "Если 0% умножения не будет, а деление/сложение/вычитание будут выпадать с равной вероятностью (по ~33.3%).");
        int multiplyProbabilityPercent = scanner.nextInt();


        if (multiplyProbabilityPercent < 0 || multiplyProbabilityPercent > 100) {
            System.out.println("Ошибка: вероятность должна быть от 0 до 100.");
            return;
        }


        int randomValue = rand.nextInt(100); // число от 0 до 99
        String operation;
        double result;
        double factor;

        if (randomValue < multiplyProbabilityPercent) {

            factor = rand.nextInt(9) + 1;
            result = number * factor;
            operation = "умножили на";
        } else {

            int remainder = rand.nextInt(3);
            factor = rand.nextInt(9) + 1;

            if (remainder == 0) {

                result = number / factor;
                operation = "разделили на";
            } else if (remainder == 1) {

                result = number + factor;
                operation = "прибавили";
            } else {

                result = number - factor;
                operation = "вычли";
            }
        }

        System.out.printf("Вы %s %d. Исходное число: %.2f, результат: %.2f%n",
                operation, (int) factor, number, result);

        scanner.close();
    }
}
