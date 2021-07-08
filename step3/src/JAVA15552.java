import java.io.*;

public class JAVA15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            int A = Integer.parseInt(br.readLine());
            int B = Integer.parseInt(br.readLine());
            bw.write(A + B);
        }
    }
}
