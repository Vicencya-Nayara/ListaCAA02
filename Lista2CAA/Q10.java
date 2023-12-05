/*Dado um array ordenado de inteiros distintos e um valor alvo, retorne o índice se o alvo for
encontrado. Caso contrário, retorne o índice onde estaria se fosse inserido na ordem.
Você deve escrever um algoritmo com complexidade de tempo de execução O(logn). */

public class Q10 {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
    
        while (left <= right) {
            int mid = left + (right - left) / 2;
    
            if (nums[mid] == target) {
                return mid; // Elemento encontrado, retorna o índice
            } else if (nums[mid] < target) {
                left = mid + 1; // Continue procurando à direita
            } else {
                right = mid - 1; // Continue procurando à esquerda
                }
            }

            return left;
        }
    
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        System.out.println("Exemplo 1: " + searchInsert(nums1, target1)); 
    
        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        System.out.println("Exemplo 2: " + searchInsert(nums2, target2)); 
    }
}    

