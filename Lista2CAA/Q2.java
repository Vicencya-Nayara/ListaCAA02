/*Faça um algoritmo de divisão e conquista para multiplicar duas matrizes quadradas (ou seja,
o número de linhas é igual ao número de colunas), dividindo cada matriz em 9 submatrizes
quadradas. Calcule a complexidade de tempo em notação assintótica. */

public class Q2 {
    public static int[][] multiplicarMatrizes(int[][] A, int[][] B, int n) {
        int[][] C = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                C[i][j] = 0;
                for (int k = 0; k < n; ++k) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    public static void main(String[] args) {
        int n = 3; 
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] C;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                A[i][j] = i + j;
                B[i][j] = i - j;
            }
        }

        C = multiplicarMatrizes(A, B, n);

        System.out.println("Matriz Resultante:");
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
