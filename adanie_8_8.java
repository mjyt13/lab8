import java.util.Scanner;
import static java.lang.System.*;
public class adanie_8_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.println("введите размерность n массива вида nxn");
        int N = sc.nextInt(), k = 0;
        double A[][] = new double[N][N];
        double c = 0;
        double b = 0;
        while(k<Math.ceilDiv(N/2,2)){
            for(int i=N-1;i>=(N/2)+2*k;i--){
                b++;
                int j = k;
                A[i][j]=b;
            }
            for(int i=N/2+(2*k)+1;i<N;i++){
                b++;
                int j=i-k-(N/2);
                A[i][j]=b;
            }
            k++;
        }
        b=0;
        k=0;
        while(k<Math.ceilDiv(N/2,2)){
            for(int i=N-1;i>=(N/2)+2*k;i--){
                b++;
                int j =(N/2)+ k;
                A[i][j]=b;
            }
            for(int i=(N/2)+(2*k)+1;i<N;i++){
                b++;
                int j=i-k;
                A[i][j]=b;
            }
            k++;
        }
        b=0;
        k=0;
        while(k<Math.ceilDiv(N/2,2)){
            for(int i=(N/2)-1;i>=2*k;i--){
                b++;
                int j = k;
                A[i][j]=b;
            }
            for(int i=(2*k)+1;i<(N/2);i++){
                b++;
                int j=i-k;
                A[i][j]=b;
            }
            k++;
        }
        b=0;
        k=0;
        while(k<Math.ceilDiv(N/2,2)){
            for(int i=(N/2)-1;i>=2*k;i--){
                b++;
                int j =(N/2)+k;
                A[i][j]=b;
            }
            for(int i=(2*k)+1;i<(N/2);i++){
                b++;
                int j=(N/2)+i-k;
                A[i][j]=b;
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