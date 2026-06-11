import java.util.Scanner;

public class counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        text = text.replaceAll("[^a-zA-Za-яА-ЯёЁ0-9\\s]", " ");
        text = text.trim().replaceAll("\\s+", " ");
        if (text.isEmpty()) {
            System.out.println("В тексте нет слов.");
            return;
        }
        String[] words = text.split("\\s+");
        int wordCount = words.length;
        System.out.println("Количество слов: " + wordCount);

    }
}