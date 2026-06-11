import java.util.Scanner;

public class PasswordCheck {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        String correctPassword = "5749";
        System.out.println("Введите пароль");
        String input = sc.nextLine();

        if (input.equals(correctPassword)) {
            System.out.println("Добро пожаловать!");
        } else  {
            System.out.println("Пароль неверный");
        }

    }
}
