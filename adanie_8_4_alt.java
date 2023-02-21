import static java.lang.System.*;
import java.util.*;
public class adanie_8_4_alt {
    public static void main(String[] args) {
        out.println("Введите количество элементов массива");
        Scanner W4 = new Scanner(System.in);
        int N = W4.nextInt(), t=1;
        int y=0;
        double k;
        out.println("Введите элементы массива");
        double A[] = new double[N];
        for(int i=0; i<N;i++) {
            A[i] = W4.nextDouble();
        }
        while(t>0){
            t=0;
            for(int i=0;i<N-1;i++){
                if(A[i]>A[i+1]){
                    k=A[i];
                    A[i]=A[i+1];
                    A[i+1]=k;
                    t++;
                }
            }
            PrintM(A);
            out.println();
            y++;
        }
        PrintM(A);
        out.println();
        out.println("количество итераций равно "+y);
    }
    public static void PrintM(double[] array){

        for(int i=0;i<array.length;i++){
            if(array[i]-Math.floor(array[i])==0){
                out.print((int)(array[i])+" ");
            }else{
                out.print(array[i]+" ");
            }
        }
    }
}