/*1. Elabore um algoritmo O(n) de decomposição de um vetor S em três subvetores. Esse algoritmo
recebe como entrada, além do vetor S, um valor piv pertencente a S, e os índices p e r, 1 ≤ p ≤ r.
O algoritmo deve rearrumar os elementos em S[p . . . r] e retornar dois índices q1 e q2 satisfazendo
as seguintes propriedades:
(a) se p ≤ k ≤ q1, então S[k] < piv;
(b) se q1 < k ≤ q2, então S[k] = piv;
(c) se q2 < k ≤ r, então S[k] > piv. */

public class Q1 {
    public static void decompor(int[] S, int piv, int p, int r) {
        int q1 = p;
        int q2 = r;
        int i;

        // Mostra o vetor original
        System.out.println("Vetor original:");
        for (i = 0; i < S.length; i++) {
            System.out.print(S[i] + " ");
        }
        System.out.println();

        i = p;
        while (i <= q2) {
            if (S[i] < piv) {
                int tmp = S[q1];
                S[q1] = S[i];
                S[i] = tmp;
                q1++;
                i++;
            } else if (S[i] == piv) {
                i++;
            } else {
                int tmp = S[q2];
                S[q2] = S[i];
                S[i] = tmp;
                q2--;
            }
        }

        // Mostra o vetor depois da decomposição
        System.out.println("Vetor depois da decomposição:");
        for (i = 0; i < S.length; i++) {
            System.out.print(S[i] + " ");
        }
        System.out.println();

        System.out.println("q1: " + q1 + ", q2: " + q2);
    }

    public static void main(String[] args) {
        int[] S = {1, 4, 5, 3, 4, 5, 6};
        int piv = 3;
        int p = 0;
        int r = S.length - 1;

        decompor(S, piv, p, r);
    }
}
