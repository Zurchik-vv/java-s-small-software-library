import java.time.Year;
import java.util.Scanner;
public class year {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year of Birth:");
        int yob = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Birthday Passed (y/n)?");
        String ans = scanner.nextLine();

        int age = Year.now().getValue() - yob;
        if(ans.equalsIgnoreCase("n")){
            age--;
        }
        System.out.println("You are " + age + " years old");
    }
}