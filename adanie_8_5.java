import static java.lang.System.*;
import java.util.*;
public class adanie_8_5 {
    public static void main(String[] args) {
        Scanner T5 = new Scanner(System.in);
        out.println("Введите порядок квадратной матрицы");
        int M = T5.nextInt(), S=0, d=0;
        double A[][]=new double[M][M];
        out.println("Введите элементы матрицы");
        for(int i =0;i<M;i++){
            for(int j=0;j<M;j++){
                A[i][j]=T5.nextDouble();
            }
        }
        for(int j=0;j<M-1;j++){
            S=0;
            d++;
            for(int i=0;i<=j;i++){
                int k=j-i;
                S+=A[i][k];
            }
            out.println("сумма "+d+" диагонали, параллельной побочной равна "+S);
        }
        for(int i=1; i<M;i++){
            S=0;
            int k=0;
            d++;
            for(int j=M-1;j>=i;j--){
                 S+=A[i+k][j];
                 k++;
            }
            out.println("сумма "+d+" диагонали, параллельной побочной равна "+S);
        }
    }
}
