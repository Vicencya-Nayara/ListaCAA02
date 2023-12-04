# ListaCAA02

5. Analise os algoritmos abaixo de maneira mais justa possível. Definir o custo dos laços em termos de n. 
1- 
1 sum = 0; 
2 for ( int i =0; i < n ; i ++) { 
3 for ( int j =1; j <= n ; j ++) { 
4 sum ++; 
5 } 
6 } 
2- 
1 sum = 0; 
2 for ( int i =1; i < n ; i *=2) { 
3 for ( int j =1; j <= n ; j ++) { 
4 sum ++; 
5 } 
6 } 
3- 
1 sum = 0; 
2 for ( int i =0; i < n ; i *=2) { 
3 for ( int j =1; j <= n ; j += i ) { 
4 sum ++; 
5 } 
6 } 

RESPOSTA:
Algoritmo 1: O algoritmo 1 tem dois loops aninhados. O primeiro loop externo executa n vezes, pois o intervalo de iteração é 0 <= i < n. O segundo loop interno executa n vezes, pois o intervalo de iteração é 1 <= j <= n. Portanto, o custo total do algoritmo é n * n = n^2.
Algoritmo 2: O algoritmo 2 também tem dois loops aninhados. O primeiro loop externo executa log_2(n) vezes, pois o intervalo de iteração é 1 <= i < n e i *= 2. O segundo loop interno executa n vezes, pois o intervalo de iteração é 1 <= j <= n. Portanto, o custo total do algoritmo é log_2(n) * n = n \cdot log_2(n).
Algoritmo 3: O algoritmo 3 também tem dois loops aninhados. O primeiro loop externo executa log_2(n) vezes, pois o intervalo de iteração é 0 <= i < n e i *= 2. O segundo loop interno executa n / i vezes, pois o intervalo de iteração é 1 <= j <= n e j += i. Portanto, o custo total do algoritmo é log_2(n) \cdot \frac{n}{i} = \frac{n^2}{i} = \frac{n^2}{log_2(n)}.


8. (Algoritmos não-recursivos) Determine a função de complexidade (no pior e melhor caso e no caso médio), das funções implementadas em Python, apresentadas abaixo, fazendo as considerações pertinentes. 
1 # primeiro 
2 def bubble_sort (A , n ) : 
3 for j in range ( n ) : 
4 for i in range ( n - 1) : 
5 if A [ i ] > A [ i + 1]: 
6 aux = A [ i ] 
7 A [ i ] = A [ i + 1] 
8 A [ i + 1] = aux 
1 # segundo 
2 def bubble_sort2 (A , n ) : 
3 troca = True 
4 while troca : 
5 troca = False 
6 for i in range ( n - 1) : 
7 if A [ i ] > A [ i + 1]: 
8 aux = A [ i ] 
9 A [ i ] = A [ i + 1] 
10 A [ i + 1] = aux 
11 troca = True 
1 def AlgumaCoisa ( n ) : 
2 x = 0 
3 for i in range (1 , n ): 
4 for j in range ( i + 1 , n + 1) : 
5 for k in range (1 , j + 1) : 
6 x = x + 1 
1 def AlgumaCoisa2 ( n ) : 
2 x = 0 
3 for i in range (1 , n + 1) : 
4 for j in range ( i + 1 , n ) : 
5 for k in range (1 , j + 1) : 
6 x = x + 1 

RESPOSTA:
AlgumaCoisa:
Esta função tem complexidade O(n³) no pior caso.
Pior Caso: O(n³) - Três loops aninhados.
Melhor Caso: O(n) - Se n=1, o loop externo não executa.
Caso Médio: O(n³) - Média entre o pior e melhor caso.

AlgumaCoisa2:
Esta função tem complexidade O(n³) no pior caso.
Pior Caso: O(n³) - Três loops aninhados.
Melhor Caso: O(n²) - Se o loop intermediário não executa.
Caso Médio: O(n³) - Média entre o pior e melhor caso.

