import java.util.Scanner;

public class JAVA10869 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first;
        int second;


        first = scanner.nextInt();
        second = scanner.nextInt();

        System.out.println( first + second);
        System.out.println( first - second);
        System.out.println( first * second);
        System.out.println( first / second);
        System.out.println( first % second);
    }
}
