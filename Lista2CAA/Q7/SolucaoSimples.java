/*Dado um array inteiro nums classificado em ordem não decrescente, retorne um array dos qua-
drados de cada número classificado em ordem não decrescente.

Example 1:
Entrada: nums = [−4, −1, 0, 3, 10]
Saida: [0,1,9,16,100]
Explicação: Após a quadratura, a matriz se torna [16,1,0,9,100].
Após a classificação, torna-se [0,1,9,16,100].
• O quadrado de cada elemento e classificar a nova matriz é muito trivial. Solução simples:
O(n log n)
• Você poderia encontrar uma solução O(n) usando uma abordagem diferente? Bonus 0.2 */

package Q7;
import java.util.Arrays;


public class SolucaoSimples {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;

        // Quadrado de cada elemento
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] * nums[i];
        }

        // Classificar a nova matriz
        Arrays.sort(nums);

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] output = sortedSquares(nums);
        System.out.println(Arrays.toString(output));
    }
}

