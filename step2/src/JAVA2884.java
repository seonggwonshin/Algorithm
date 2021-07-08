import java.util.Scanner;

public class JAVA2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x < 24 && y <= 59) {
            if (y < 45) {
                if (x != 0) {
                    x = x - 1;
                    y = y + 15;
                    System.out.print(x + " " + y);
                } else {
                    x = 23;
                    y = y + 15;
                    System.out.print(x + " " + y);
                }
            } else {
                if (x != 0) {
                    y = 60 - y;
                    System.out.print(x + " " + y);
                } else {
                    x = 23;
                    y = 60 - y;
                    System.out.print(x + " " + y);
                }
            }
        }else{
            System.out.println("잘못된 입력입니다.");
        }
    }
}
