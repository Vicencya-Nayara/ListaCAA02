package Q11;
/*11. (Bonus 0.6) Você recebe dois arrays de inteiros nums1 e nums2, classificadas em ordem não
decrescente, e dois inteiros m e n, representando o número de elementos em nums1 e nums2
respectivamente.
Mesclar nums1 e nums2 em uma única matriz classificada em ordem não decrescente.
O array classificado final não deve ser retornado pela função, mas sim armazenado dentro do
array nums1. Para acomodar isso, nums1 tem um comprimento de m + n, onde os primeiros m
elementos denotam os elementos que devem ser mesclados e os últimos n elementos são definidos
como 0 e devem ser ignorados. nums2 tem um comprimento de n.
Exemplo 1:
Entrada:
nums1 = [1,2,3,0,0,0], m = 3,
nums2 = [2,5,6], n = 3
Saída: [1,2,2,3,5,6]
Explicação: Os arrays que estamos mesclando são [1,2,3] e [2,5,6]. O resultado da mesclagem
é [1,2,2,3,5,6] com os elementos sublinhados vindos de nums1.
* Caso simples: O((m + n)log(m + n))
* Você consegue criar um algoritmo que execute em tempo O(m + n)? */

public class MergeArrays {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        System.arraycopy(nums2, 0, nums1, 0, j + 1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}

