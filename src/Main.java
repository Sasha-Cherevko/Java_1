import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = 0, M = 0;
        int tmp = 0;

        System.out.print("Введите ширину матрицы: ");
        M = Integer.parseInt(reader.readLine());

        System.out.print("Введите высоту матрицы: ");
        N = Integer.parseInt(reader.readLine());

        int[][] array = new int[M][N];


        System.out.println("Исходный массив: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = (int) (Math.random() * 90);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int[] array_tmp = new int[N * M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                array_tmp[tmp++] = array[i][j];
            }
        }
        Arrays.sort(array_tmp);
        tmp = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = array_tmp[tmp++];
            }
        }

        System.out.println("Сортированный массив: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

