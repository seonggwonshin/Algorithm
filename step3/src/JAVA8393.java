import java.util.Scanner;

public class JAVA8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        if(1<=n && n<=10000){
            for(int i=1;i<=n;i++){
                sum += i;
            }
            System.out.println(sum);
        }
    }
}
