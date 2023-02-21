import static java.lang.System.*;
import java.util.*;
public class adanie_8_4 {
    public static void main(String[] args) {
        out.println("Введите количество элементов массива");
        Scanner W4 = new Scanner(System.in);
        int N = W4.nextInt();
        int h=0,k = 0, y=0;
        out.println("Введите элементы массива");
        double A[] = new double[N];
        for(int i=0; i<N;i++) {
            A[i] = W4.nextDouble();
        }
        while(h<N){
            double a = A[h];
            double b=A[h];
            k=h;
            for(int i=h;i<N;i++){
                if(A[i]<b){
                    b=A[i];
                    k=i;
                }
            }
            A[k]=a;
            A[h]=b;
            h++;
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
