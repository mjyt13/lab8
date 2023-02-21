import java.util.Scanner;

import static java.lang.System.*;

public class adanie_8_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.println("введите размерность n массива вида nxn");
        int N = sc.nextInt(), k = 0;
        double A[][] = new double[N][N];
        double b = 0;
        while (k < Math.ceilDiv(N, 2)) {
            for (int i = 0; i < N - (2 * k); i++) {
                b++;
                int j = i + k;
                A[i][j] = b;
            }
            for (int i = N - 2 - (2 * k); i >= 0; i--) {
                b++;
                int j = N - k - 1;
                A[i][j] = b;
            }
            k++;
        }
        printM(A);
    }

    public static void printM(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                out.print((int) (array[i][j]) + "\t");
            }
            out.println();
        }
    }
}
