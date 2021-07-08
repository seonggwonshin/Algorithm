import java.util.Scanner;

public class JAVA2588 {
    public static void main(String[] args) {
        //1 . 입력받기
        Scanner scanner = new Scanner(System.in);
//
        String second = scanner.nextLine();
        String first = scanner.nextLine();

//        System.out.println(first);
//        System.out.println(second);

//        System.out.println(first.getClass().getName());
//        System.out.println(second.getClass().getName());


        //2. charAt()을 이용해서 문자열을 뒤부터 하나씩 가져와서 int로 형변환 하기
        int c = (first.charAt(first.length()-1)) - '0';
        int b = (first.charAt(first.length()-2)) - '0';
        int a = (first.charAt(first.length()-3)) - '0';
        int second_int = Integer.parseInt(second);
        int first_int = Integer.parseInt(first);

        System.out.println(second_int * c);
        System.out.println(second_int * b);
        System.out.println(second_int * a);
        System.out.println(second_int * first_int);
    }
}
