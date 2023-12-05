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

public class SolucaoSimples {

  public static int[] encontrarSomaPar(int[] nums, int n, int x) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (nums[i] + nums[j] == x) {
          int[] indices = new int[2];
          indices[0] = i;
          indices[1] = j;
          return indices;
        }
      }
    }

    return null;
  }

  public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    int x = 9;

    int[] indices = encontrarSomaPar(nums, nums.length, x);

    if (indices != null) {
      System.out.println("Os índices dos números que somam " + x + " são " + indices[0] + " e " + indices[1] + ".");
    } else {
      System.out.println("Não existe uma solução.");
    }
  }
}