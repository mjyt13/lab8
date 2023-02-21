import java.util.Scanner;
public class adanie_8_2 {
    public static int Pad(int n){
        if(n==1||n==0||n==2){
            return 1;
        } else if(n<0){
            return Pad(n+3)-Pad(n+1);
        } else{
            return Pad(n - 2) + Pad(n - 3);
        }
    }
    public static void main(String[] args) {
        int A[];
        System.out.println("Введите количество членов массива");
        Scanner D2 = new Scanner(System.in);
        int N = D2.nextInt();
        A = new int[N];
        System.out.println("Введите члены массива");
        for(int i=0;i<N;i++){
            A[i]=D2.nextInt();
        }
        int k=0, j=N;
        for(int i=0;i<N;i++){
            if (A[i]==Pad(i+1)+Pad(i-10)){
                k++;
            }
        }
        if(k==j){
            System.out.println("Введенные числа являются последовательностью Перрина");
        }else{
            System.out.println("Введенные числа не являются последовательностью Перрина");
        }
    }
}
