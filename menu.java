import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("menu 1.0.0\n------------------------------\n:: Друзья\n1. Друзья\n2. Запросы в друзья\n3. Группы \n4. Таймер \n------------------------------\n0 Exit: "+"\nPlease enter a number:");
            if (sc.hasNextInt()) {
                int ch = sc.nextInt();
                switch (ch) {
                    case 0 -> {
                        System.out.println("Exit...");
                        sc.close();
                        return;
                    }
                    case 1 -> System.out.println("Открыт список друзей.");
                    case 2 -> System.out.println("Запросы в друзья.");
                    case 3 -> System.out.println("Группы.");
                    case 4 -> {
                        System.out.println("Запуск таймера на 10 секунд...");
                        for (int i = 10; i >= 0; i--) {
                            System.out.print(i + " ");
                            try {
                                Thread.sleep(1000); // Пауза 1 секунда
                            } catch (InterruptedException e) {
                                // Если поток прервут, просто выходим из цикла
                                System.out.println("\nТаймер прерван.");
                            }
                        }
                        System.out.println("\nFinished!!!");
                    }
                    default -> System.out.println("This feature is not implemented yet.");
                }
            } else {
                System.out.println("Please enter a number!");
                sc.next();
            }
            System.out.println();
        }
    }
}