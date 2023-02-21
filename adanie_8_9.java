import java.util.Scanner;
import static java.lang.System.*;
public class adanie_8_9 {
    public static void main(String[] args) {
        Scanner E9 = new Scanner(System.in);
        out.println("введите размерность n массива вида 2nx2n");
        int N = E9.nextInt(), k = 0;
        double A[][] = new double[2*N][2*N];
        double c = 0;
        double b = 0;
        while(k<Math.ceilDiv(N,2)) {
            for (int i = N+2 * k; i < 2*N; i++) {
                b++;
                int j =N+ 2 * k;
                A[i][j] = b;
            }
            for (int i = (2*N)-1; i > N+2*k; i--) {
                b++;
                int j =N+ (2 * k) + 1;
                A[i][j] = b;
            }
            k++;
        }
        k=0;
        b=0;
        while(k<Math.ceilDiv(N,2)) {
            for (int j = k; j < N-k; j++) {
                b++;
                int i = N+k;
                A[i][j] = b;
            }
            for (int i = N+k + 1; i < 2*N-k; i++) {
                b++;
                int j = N-1-k;
                A[i][j] = b;
            }
            k++;
        }
        k=0;
        b=0;
        while(k<Math.ceilDiv(N,2)) {
            for (int i = 2 * k; i < N; i++) {
                b++;
                int j = 2 * k;
                A[i][j] = b;
            }
            for (int i = N-1; i > 2*k; i--) {
                b++;
                int j = (2 * k) + 1;
                A[i][j] = b;
            }
            k++;
        }
        k=0;
        b=0;
        while(k<Math.ceilDiv(N,2)) {
            for (int j = N+k; j < 2*N-k; j++) {
                b++;
                int i = k;
                A[i][j] = b;
            }
            for (int i = k + 1; i < N-k; i++) {
                b++;
                int j = 2*N-1-k;
                A[i][j] = b;
            }
            k++;
        }
        vodim(A);
    }
    public static void vodim(double[][] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j< array.length;j++){
                out.print((int)array[i][j]+"\t");
            }
            out.println();
        }
    }
}