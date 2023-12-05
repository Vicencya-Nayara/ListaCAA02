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

public class AbordagemDiferente {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1, index = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }

            index--;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] output = sortedSquares(nums);
        System.out.println(Arrays.toString(output));
    }
}

