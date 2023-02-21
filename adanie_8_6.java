import static java.lang.System.*;
import java.util.*;
public class adanie_8_6 {
    public static void main(String[] args) {
        Scanner T5 = new Scanner(System.in);
        out.println("Введите порядок квадратной матрицы");
        int M = T5.nextInt(), S = 0;
        out.println("Введите элементы матрицы");
        double A[][] = new double[M][M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = T5.nextDouble();
            }
        }
        out.println("Оригинальная матрица");
        for(int i=0;i<M;i++){
            for(int j=0;j<M;j++){
                out.print(A[i][j]+"\t");
            }
            out.println();
        }
        out.println("Измененная матрица");
        for (int i=0;i<M;i++){
            for(int j=0;j<=i;j++){
                double a=A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=a;
            }
        }
        for(int i=0;i<M;i++){
            for(int j=0;j<M;j++){
                out.print(A[i][j]+"\t");
            }
            out.println();
        }
    }
}