import java.util.Scanner;
public class adanie_8_12 {
    public static void main(String[] args) {
        Scanner A12 = new Scanner(System.in);
        System.out.println("введите количество переменных(соответственно и размерность матрицы с коэффициентами)");
        int N = A12.nextInt(), k=1;
        System.out.println("Введите коэффициенты при переменных");
        double A[][]=new double[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                A[i][j]= A12.nextDouble();
            }
        }
        System.out.println("Введите переменные");
        double B[]=new double[N];
        for(int i=0;i<N;i++){
            B[i]= A12.nextDouble();
        }
        System.out.println("Теперь введите ответы, получаемые при подстановке равнее введенных коэффициентов и неизвестных");
        double F[]=new double[N];
        for(int i=0;i<N;i++){
            F[i]= A12.nextDouble();
        }
        double R[]=new double[N];
        double a;
        double S=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                a=A[i][j]*B[j];
                S+=a;
            }
            R[i]=S;
            S=0;
        }
        for(int i=0;i<N;i++){
            if(R[i]!=F[i]){
                k=0;
            }
        }
        if(k==1){
            System.out.println("Решение верно");
        }else{
            System.out.println("При введенных значениях решение неверно");
        }
    }
    public static void viv(double[] Matr){
        for(int i=0;i<Matr.length;i++){
            System.out.println(Matr[i]);
        }
    }
}
