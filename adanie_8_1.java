import java.util.Scanner;
import static java.lang.Math.*;
public class adanie_8_1 {
    public static void main(String[] args) {
        int A[];
        Scanner F8 = new Scanner(System.in);
        System.out.println("Введите количество цифр в двоичной записи числа");
        int N = F8.nextInt();
        A = new int[N];
        System.out.println("Введите цифры числа(с самого большого разряда)");
        int i,j;
        int k=0;
        for(i=0;i<N;i++){
            A[i] = F8.nextInt();
            if(A[i]!=1 && i==0){
                k=1;
                while(k>0){
                    System.out.println("Первая цифра числа не может равняться нулю");
                    A[i]= F8.nextInt();
                    if(A[i]==1){
                        k=0;
                    }
                }
            }
            if (A[i]!=1 && A[i]!=0){
                k+=1;
            }
        }
        while(k>0){
            System.out.println("В числе не должно быть цифр, отличных от 0 или 1");
            k=0;
            System.out.println("Введите цифры числа");
            for(i=0;i<N;i++){
                A[i] = F8.nextInt();
                if(A[i]!=1 && i==0){
                    k=1;
                    while(k>0){
                        System.out.println("Первая цифра числа не может равняться нулю");
                        A[i]= F8.nextInt();
                        if(A[i]==1){
                            k=0;
                        }
                    }
                }
                if (A[i]!=1 && A[i]!=0){
                    k+=1;
                }
            }
        }
        for(j=N-1;j>=0;j--){
            i=N-1-j;
            double t=i;
            k+=A[j]*pow(2,t);
        }
        j=0;
        while(k>0){
            A[j]=k%5;
            k=(k/5);
            j++;
        }
        System.out.println("Число в 5-ичной системе счисления");
        for(j=j-1;j>=0;j--){
            System.out.print(A[j]);
        }
    }
}
