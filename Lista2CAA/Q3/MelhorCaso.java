/*Dado um um vetor de números inteiros e um inteiro X, retorne os índices dos dois números
de forma que somados é igual a X. Você pode assumir que cada entrada teria exatamente
uma solução e não pode usar o mesmo elemento duas vezes. Você pode retornar a resposta em
qualquer ordem.
Solução simples: Complexidade O(n
2
)
Solução melhorada: Complexidade abaixo de O(n
2
) (bonus 0.1)
Solução melhor caso: Complexidade O(n) (bonus 0.2)
- Example 1:
Entrada: nums = [2,7,11,15], X = 9
Saida: [0,1]
Explicação: por causa que nums[0] + nums[1] == 9,
retornamos [0, 1].
- Example 2:
Entrada: nums = [3,2,4], X = 6
Saida: [1,2] */

package Q3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MelhorCaso {

  public static int[] encontrarSomaPar(int[] nums, int x) {
    Map<Integer, Integer> map = new HashMap<>();

      for (int i = 0; i < nums.length; i++) {
          int complement = x - nums[i];
          if (map.containsKey(complement)) {
            return new int[]{map.get(complement), i};
          }
          map.put(nums[i], i);
      }

        return null;
  }

  public static void main(String[] args) {
    int[] nums1 = {2, 7, 11, 15};
    int target1 = 9;
    int[] result1 = encontrarSomaPar(nums1, target1);
    System.out.println(Arrays.toString(result1));

    int[] nums2 = {3, 2, 4};
    int target2 = 6;
    int[] result2 = encontrarSomaPar(nums2, target2);
    System.out.println(Arrays.toString(result2));
  }
}
