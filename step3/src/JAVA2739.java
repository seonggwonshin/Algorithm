import java.util.Scanner;

public class JAVA2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (1 <= n && n <= 9) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(n + " * " + i + " = " + (n * i));
            }
        }
    }
}
