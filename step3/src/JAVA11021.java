import java.util.Scanner;

public class JAVA11021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i=1;i<=t;i++){
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            System.out.println("Case #"+i+": "+(A+B));
        }
    }
}
