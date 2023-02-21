import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
public class adanie_8_10 {
    public static void main(String[] args) {
        Scanner Y10 = new Scanner(System.in);
        out.println("введите количество точек N для проверки на попадание точки в область");
        int N = Y10.nextInt(), k = 0;
        double A[][] = new double[2][N];
        int T[] = new int[N];
        double x = 0;
        String B[] = new String[N];
        double y = 0;
        for(int i=0;i<N;i++){
            out.println("введите координаты "+(i+1)+" точки");
            A[0][i]= Y10.nextDouble();
            A[1][i]= Y10.nextDouble();
        }
        for(int j=0;j<N;j++){
            x=A[0][j];
             int i=-1;
            if (A[0][j] >= -3 & A[0][j] < -2) {
                double y1 = 1.0, y2 = sqrt(4 - pow(x + 1, 2)) + 1;
                if (A[1][j] > y1 & A[1][j] < y2) {
                    i=1;
                }else if(A[1][j] == y1 & A[1][j] == y2) {
                    i = 0;
                }
            } else if (A[0][j] >= -2 & A[0][j] < -1) {
                double y1 = 1.0, y2 = sqrt(4 - pow(x + 1, 2)) + 1, y3 = 2 * x + 1, y4 = (4 / 5) * x - (7 / 5);
                if ((A[1][j] > y1 & A[1][j] < y2) || (A[1][j] < y3 & A[1][j] > y4)) {
                    i=1;
                }else if((A[1][j] == y1 & A[1][j] == y2)||(A[1][j] == y3 & A[1][j] == y4)){
                    i=0;
                }
            } else if (A[0][j] >= 1 & A[0][j] < 0) {
                double y1 = 1.0, y2 = -sqrt(4 - pow(x + 1, 2)) + 1, y3 = 2 * x + 5, y4 = (4 / 5) * x - (7 / 5);
                if ((A[1][j] > y1 & A[1][j] < y3) || (A[1][j] < y2 & A[1][j] > y4)) {
                    i=1;
                } else if ((A[1][j] == y1 & A[1][j] == y3) || (A[1][j] == y2 & A[1][j] == y4))  {
                    i=0;
                }
            } else if (A[0][j] >= 0 & A[0][j] < 1) {
                double y1 = 1.0, y2 = -sqrt(4 - pow(x + 1, 2)) + 1, y3 = -(1 / 2) * x + 5, y4 = (4 / 5) * x - (7 / 5);
                if ((A[1][j] > y1 & A[1][j] < y3) || (A[1][j] < y2 & A[1][j] > y4)) {
                    i=1;
                } else if ((A[1][j] == y1 & A[1][j] == y3) || (A[1][j] == y2 & A[1][j] == y4)) {
                    i=0;
                }
            } else if (A[0][j] >= 1 & A[0][j] < 2) {
                double y1 = -(1 / 2) * x + 5, y2 = (4 / 5) * x - (7 / 5);
                if (A[1][j] > y2 & A[1][j] < y1) {
                    i=1;
                } else if (A[1][j] == y2 & A[1][j] == y1) {
                    i=0;
                }
            } else if (A[0][j] >= 2 & A[0][j] < 3) {
                double y1 = -3 * x + 10, y2 = (4 / 5) * x - (7 / 5), y3 = x - 3, y4 = -sqrt(4 - pow(x - 4, 2)) - 1;
                if ((A[1][j] > y2 & A[1][j] < y1)||(A[1][j] < y3 & A[1][j] > y4)) {
                    i=1;
                } else if ((A[1][j] == y2 & A[1][j] == y1)||(A[1][j] == y3 & A[1][j] == y4)) {
                    i=0;
                }
            } else if (A[0][j] >= 3 & A[0][j] < 4) {
                double y1 = x - 3, y2 = -sqrt(4 - pow(x - 4, 2)) - 1;
                if (A[1][j] <= y1 & A[1][j] >= y2) {
                    i=1;
                } else if (A[1][j] == y1 & A[1][j] == y2) {
                    i=0;
                }
            } else if (A[0][j] >= 4 & A[0][j] < 5) {
                double y1 = sqrt(4 - pow(x - 4, 2)) - 1, y2 = -x + 1;
                if (A[1][j] > y2 & A[1][j] < y1) {
                    i=1;
                } else if (A[1][j] == y2 & A[1][j] == y1) {
                    i=0;
                }
            } else if (A[0][j] >= 5 & A[0][j] < 6) {
                double y1 = sqrt(4 - pow(x - 4, 2)) - 1, y2 = (1 / 2) * x - (13 / 2);
                if (A[1][j] > y2 & A[1][j] < y1) {
                    i=1;
                } else if ((A[1][j] == y2 & A[1][j] == y1)) {
                    i=0;
                }
            } else if (A[0][j] >= 6 & A[0][j] <= 7) {
                double y1 = -2 * x + 11, y2 = (1 / 2) * x - (13 / 2);
                if (A[1][j] > y2 & A[1][j] < y1) {
                    i=1;
                } else if ((A[1][j] == y2 & A[1][j] == y1)) {
                    i=0;
                }
            }
            T[j]=i;
        }
        for(int i=0;i<N;i++){
            if (T[i] == -1) {
                out.println((i+1)+" точка не попала ни в одну из фигур");
            } else if (T[i] == 0) {
                out.println((i+1)+" точка попала на край фигуры");
            } else if (T[i] == 1) {
                out.println((i+1)+" точка попала в одну из фигур");
            }
        }
    }
}