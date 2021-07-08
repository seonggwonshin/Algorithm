import java.util.Scanner;
public class JAVA10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] arr = new int[n];
//        System.out.println(arr.length);
        for(int i =0; i<arr.length;i++){
            int tmp = scanner.nextInt();
            if(tmp < x){
                arr[i] = tmp;
            }
        }
        for(int i=0; i<arr.length;i++){
            if(arr[i] != 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
