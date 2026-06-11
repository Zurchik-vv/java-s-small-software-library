import java.util.Scanner;
public class Userdataentry {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите логин:");
        String correctlogin = "zurchik";
        String input = sc.nextLine();

        if (input.equals(correctlogin)) {
            System.out.println("");

        } else {

            System.out.println("Логин не верный!");
            return;
        }
        System.out.println("Введите пароль:");
        String correctPass = "1234";
        String pass = sc.nextLine();

        if (pass.equals(correctPass)) {


        } else {

            System.out.println("Пароль не верный!");
            return;
        }

        System.out.println("Добро пожаловать!");
        System.out.println(correctlogin);

    }
}