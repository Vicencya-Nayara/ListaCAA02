/*4. Dado um array nums de tamanho n, retorne o elemento majoritário. O elemento majoritário é
aquele que aparece mais de [n/2] vezes. Você pode assumir que o elemento majoritário sempre
existe no array.
Solução melhor caso: Tempo linear (O(n)) e O(1) em espaço. */

public class Q4 {

  public static int encontrarMajoritario(int[] nums) {
    int count = 0;
    int candidato = nums[0];

    for (int x : nums) {
      if (count == 0) {
        candidato = x;
        count = 1;
      } else if (x == candidato) {
        count++;
      } else {
        count--;
      }
    }

    return count > 0 ? candidato : -1;
  }

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 3, 3, 3};
    int candidato = encontrarMajoritario(nums);
    System.out.println("O candidato majoritário é " + candidato);
  }
}
