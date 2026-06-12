import java.util.Scanner;
public class registration {
    public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Регистрация");
        System.out.println("Придумайте логин:");
        String input = sc.nextLine();
        System.out.println("Придумайте пароль:");
        String pass = sc.nextLine();
        System.out.println("Повторите пароль:");
        String passconf = sc.nextLine();

        if (pass.equals(passconf)) {
            System.out.println("Пароль установлен!");
        } else {
            System.out.println("Пароли не совпадают, попробуйте ещё раз!");
            return;
        }


        System.out.println("Войти");
        System.out.println("Введите логин:");
        String correctlogin = sc.nextLine();
        if (correctlogin.equals(input)) {
            System.out.println("Введите пароль:");
            String correctpass = sc.nextLine();
            if (correctpass.equals(pass)) {
                System.out.println("Вы успешно вошли!");
            } else {
                System.out.println("Не верный пароль!");
            }
        } else {
            System.out.println("Такой логин не найден!");
        }
            sc.close();
    }
}
