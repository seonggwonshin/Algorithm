import java.util.Scanner;

public class JAVA1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first;
        double second;
        double result;

        first = scanner.nextInt();
        second = scanner.nextInt();
        result = (double) first / second;

        System.out.println(result);
    }
}
