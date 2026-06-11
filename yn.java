import java.util.Scanner;

public class yn {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int last1 = Math.abs(num1 % 10);
        int last2 = Math.abs(num2 % 10);

        if (last1 == last2) {
            System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

