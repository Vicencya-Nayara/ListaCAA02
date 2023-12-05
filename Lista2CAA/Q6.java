/*Uma subsequência é palíndroma se ela é igual lendo da direita para esquerda ou lendo da esquerda
para direita. Por exemplo, a sequência (ACGT GT CAAAAT CG) possui muitas subsequências
palíndromas, como (ACGCA) e (AGT GA). Mas a subsequência (ACT) não é palíndroma.
Escreva um algoritmo O(n2) que recebe uma sequência S[1 . . . n] e retorna a subsequência palín-
droma de tamanho máximo. */

public class Q6 {

    public static String longestPalindromicSubsequence(String s) {
        int n = s.length();

        // Inicializa uma matriz para armazenar os comprimentos das subsequências palíndromas
        int[][] dp = new int[n][n];

        // Cada caractere individual é uma subsequência palíndroma de tamanho 1
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        // Preenche a matriz para subsequências de tamanho maior
        for (int cl = 2; cl <= n; cl++) {
            for (int i = 0; i < n - cl + 1; i++) {
                int j = i + cl - 1;
                if (s.charAt(i) == s.charAt(j) && cl == 2) {
                    dp[i][j] = 2;
                } else if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
                }
            }
        }

        // Reconstrói a subsequência palíndroma de tamanho máximo
        char[] result = new char[dp[0][n - 1]];
        int i = 0, j = n - 1, k = 0;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                result[k] = s.charAt(i);
                result[dp[0][n - 1] - k - 1] = s.charAt(j);
                i++;
                j--;
                k++;
            } else if (dp[i][j - 1] > dp[i + 1][j]) {
                j--;
            } else {
                i++;
            }
        }

        return new String(result);
    }

    public static void main(String[] args) {
        String sequence = "ACGTGTCAAAATCG";
        String result = longestPalindromicSubsequence(sequence);
        System.out.println(result);
    }
}
