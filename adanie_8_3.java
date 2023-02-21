import java.util.Scanner;

public class adanie_8_3 {
    public static void main(String[] args) {
        int A[];
        System.out.println("Введите количество точек плоскости");
        Scanner D2 = new Scanner(System.in);
        int N = D2.nextInt();
        A = new int[2 * N];
        System.out.println("Введите координаты точек");
        for (int i = 0; i < 2 * N; i++) {
            if(i%2==0){
                System.out.println(i / 2 + 1 + " точка");
            }
            A[i] = D2.nextInt();
        }
        for (int i = 0; i < 2 * N; i += 2) {
            for (int j = i + 2; j < 2 * N; j += 2) {
                for (int k = j + 2; k < 2 * N; k += 2) {
                    if ((A[i] == A[j] || A[i] == A[k] || A[j] == A[k]) && (A[i + 1] == A[j + 1] || A[i + 1] == A[k + 1] || A[j + 1] == A[k + 1])) {
                        System.out.println(((i / 2)+1) + ", " + ((j / 2)+1) + ", " + ((k / 2)+1) + " - точки с этими номерами могут образовывать прямоугольные треугольники");
                    }
                }
            }
        }
    }
}